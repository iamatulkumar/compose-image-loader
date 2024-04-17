package com.library.imageload.model

import kotlinx.serialization.json.Json

val JSON = Json {
    ignoreUnknownKeys = true
    isLenient = true
    coerceInputValues = true
}

inline fun <reified T> String.decodeJson(): T = JSON.decodeFromString(this)
