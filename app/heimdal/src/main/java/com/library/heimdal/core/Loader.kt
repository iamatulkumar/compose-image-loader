package com.library.heimdal.core

import java.io.File

interface Loader {
    val schemes: List<String>

     fun load(uriString: String, file: File): Boolean
}
