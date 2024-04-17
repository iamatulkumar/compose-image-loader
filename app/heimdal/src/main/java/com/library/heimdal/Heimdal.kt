package com.library.heimdal

import android.content.Context
import com.library.heimdal.core.decoder.Decoder
import com.library.heimdal.core.disk.DiskCacheImpl
import com.library.heimdal.core.provider.FileProvider
import com.library.heimdal.core.provider.FileProviderImpl
import com.library.heimdal.loader.ImageLoader
import com.library.heimdal.loader.ImageLoaderImpl
import com.library.heimdal.core.memory.MemoryCache
import com.library.heimdal.core.memory.MemoryCacheImpl
import com.library.heimdal.core.decoder.BitmapDecoder
import com.library.heimdal.loader.ContentLoader
import com.library.heimdal.loader.FileLoader
import com.library.heimdal.loader.UrlLoader
import com.tomclaw.cache.DiskLruCache

object Heimdal {

    var imageLoader: ImageLoader? = null

    fun Context.imageLoader(): ImageLoader {
        return imageLoader ?: initImageLoader()
    }

    private fun Context.initImageLoader(
        fileProvider: FileProvider = FileProviderImpl(
            cacheDir,
            DiskCacheImpl(DiskLruCache.create(cacheDir, 15728640L)),
            UrlLoader(),
            FileLoader(assets),
            ContentLoader(contentResolver)
        ),
        decoders: List<Decoder> = listOf(BitmapDecoder()),
        memoryCache: MemoryCache = MemoryCacheImpl(),
    ): ImageLoader {
        val loader = ImageLoaderImpl(
            fileProvider,
            decoders,
            memoryCache,
        )
        imageLoader = loader
        return loader
    }

}