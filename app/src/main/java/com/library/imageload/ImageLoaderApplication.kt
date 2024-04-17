package com.library.imageload

import android.app.Application
import com.library.heimdal.Heimdal
import com.library.heimdal.Heimdal.imageLoader

class ImageLoaderApplication : Application() {
    override fun onCreate() {
        super.onCreate()
            imageLoader()
    }
}