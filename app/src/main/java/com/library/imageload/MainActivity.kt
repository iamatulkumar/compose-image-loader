package com.library.imageload

import android.graphics.Bitmap
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.produceState
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.library.heimdal.util.fetch
import com.library.imageload.model.Image
import com.library.imageload.model.decodeJson
import com.library.imageload.ui.theme.ImageLoadTheme
import com.library.imageload.uitls.imageJsonData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImageLoadTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val images by rememberImageList(imageJsonData)
                    LazyVerticalGrid(
                        GridCells.Fixed(3),
                        Modifier.padding(2.dp).fillMaxSize(),
                    ) {
                        items(images){image ->
                            ImageItem(
                                data = image.imageUrl,
                            )
                        }
                    }
                }
            }
        }
    }

    @Composable
    fun ImageItem(
        data: String = "https://images.unsplash.com/photo-1550973886-796d048c599f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjU4MjM5fQ",
        modifier: Modifier = Modifier.aspectRatio(1f),
    ) {

        val context = LocalContext.current

        var isLoading by remember {
            mutableStateOf<Boolean>(true)
        }

        var bitMap by remember {
            mutableStateOf<Bitmap?>(null)
        }

        if(bitMap == null && isLoading) {
            fetch(
                context,
                data,
                onSuccess = {
                        loadBitMap ->
                    bitMap = loadBitMap
                    isLoading = false
                }, onError = {
                    isLoading = false
                },
            )
            }

        Box(modifier, Alignment.Center) {
            if(isLoading) {
                CircularProgressIndicator()
            } else {
                bitMap?.also {loadedBitMap ->
                    Image(bitmap = loadedBitMap.asImageBitmap(), contentDescription = "")
                }
            }
        }
    }

    @Composable
    fun rememberImageList(content: String): State<List<Image>> {
        return produceState(emptyList()) {
            value = withContext(Dispatchers.Default) {
                content.decodeJson()
            }
        }
    }

}


