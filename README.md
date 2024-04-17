# Heimdal Image Loader

Modern image loading library for Android. Simple by design, powerful under the hood.

- **Kotlin**: Heimdal Image Loader is Kotlin-native and uses no any dependencies 

## Demo

Please see the app for library usage example.

## Quick Start

To load an image in jetpack compose 
```kotlin
// Initialize SDK in Application
// Sample application
class ImageLoaderApplication : Application() {
    override fun onCreate() {
        super.onCreate()
            imageLoader()
    }
}
```

Configured Image request

```kotlin
 fetch(
    context,
    data,
    onSuccess = {
        // Lamda function
    }, onError = {
         // Lamda function
    },
)
```

```

#### Image Loader

`imageloader()` uses the singleton `Heimdal` class. The singleton `imageLoader()` can be accessed using an extension function

To configure custom singleton `Heimdal`, 

```kotlin
val imageLoader = initImageLoader(
    decoders = listOf(BitmapDecoder()),                     // images decoders
    fileProvider = FileProviderImpl(
        cacheDir,
        DiskCacheImpl(                                      // LRU disk cache for your images
            DiskLruCache.create(cacheDir, 15728640L)
        ),
        UrlLoader(),                                        // vararg; http/https scheme support
        FileLoader(assets),                                 // vararg; file scheme support
        ContentLoader(contentResolver)                      // vararg; content scheme support
    ),
    memoryCache = MemoryCacheImpl(),                        // Caching images on memory
)
```
