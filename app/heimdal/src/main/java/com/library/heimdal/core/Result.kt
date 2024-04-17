package com.library.heimdal.core

import android.graphics.Bitmap

interface Result {

    fun getByteCount(): Int

    fun isRecycled(): Boolean

    fun getBitmap(): Bitmap

}