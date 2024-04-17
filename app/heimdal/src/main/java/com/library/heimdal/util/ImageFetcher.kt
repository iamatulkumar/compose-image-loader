package com.library.heimdal.util

import android.content.Context
import android.graphics.Bitmap
import com.library.heimdal.Heimdal.imageLoader

fun fetch(context: Context, url: String, onSuccess:(Bitmap)-> Unit, onError:()->Unit) {
    context.imageLoader().load(onSuccess, onError, url)
}
