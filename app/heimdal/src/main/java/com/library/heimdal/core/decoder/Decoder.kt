package com.library.heimdal.core.decoder
import com.library.heimdal.core.Result
import java.io.File

interface Decoder {
    fun probe(file: File): Boolean

    fun decode(file: File, width: Int, height: Int): Result?
}