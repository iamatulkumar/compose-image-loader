package com.library.heimdal.loader

import android.graphics.Bitmap
import com.library.heimdal.core.decoder.Decoder
import com.library.heimdal.core.memory.MemoryCache
import com.library.heimdal.core.provider.FileProvider
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.security.MessageDigest

interface ImageLoader {
    fun load(
        onSuccess: (Bitmap) -> Unit,
       onError: () -> Unit,
        uriString: String,
    )

}

class ImageLoaderImpl(
    private val fileProvider: FileProvider,
    private val decoders: List<Decoder>,
    private val memoryCache: MemoryCache,
) : ImageLoader {

     private val width = 300
     private val height = 300

    @OptIn(DelicateCoroutinesApi::class)
    override fun load(
        onSuccess: (Bitmap) -> Unit,
        onError: () -> Unit,
        url: String,
    ) {
        val key = generateKey(url, width, height)
        GlobalScope.launch {
            memoryCache.get(key)
                ?.takeUnless { it.isRecycled() }
                ?.run { onSuccess(this.getBitmap()) }
                ?: loadAsync(onSuccess,onError, url, key)
        }
    }

    private suspend fun loadAsync(
        onSuccess: (Bitmap) -> Unit,
        onError: ()->Unit,
        uriString: String,
        key: String,
    ) {
        CoroutineScope(SupervisorJob() + Dispatchers.IO).async {
            try {
                val file = fileProvider.getFile(uriString)
                val bitmap = file?.let { file ->
                    decoders.find { decoder -> decoder.probe(file) }
                        ?.run { decode(file, 300, 300) }
                }
                bitmap?.let { result ->
                    memoryCache.put(key, result)
                    withContext(Dispatchers.Main) {
                        onSuccess(result.getBitmap())
                    }
                } ?: onError()
            } catch (e: Exception) {
                onError()
            }
        }.await()
    }

    private fun generateKey(url: String, width: Int, height: Int): String {
        return url.toSHA1() + "_" + width + "_" + height
    }

    private fun String.toSHA1(): String {
        val bytes = MessageDigest.getInstance("SHA-1").digest(this.toByteArray())
        return bytes.toHex()
    }

    private fun ByteArray.toHex(): String {
        return joinToString("") { "%02x".format(it) }
    }

}
