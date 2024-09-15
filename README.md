## 1. Add Retrofit dependency in app level build.gradle.kts
Reference URL - https://square.github.io/retrofit/  (Go to download option)
- For getting the latest version go to github for retrofit - https://github.com/square/retrofit
```
 dependencies {
    implementation ("com.squareup.retrofit2:retrofit:2.11.0")
}
```

## 2. Add Converter dependency in app level build.gradle.kts
Reference URL - https://square.github.io/retrofit/
- also add the save version on retrofitVersion
```
- dependencies {
    implementation ("com.squareup.retrofit2:converter-gson:2.11.0")
}
```

##3. Add Kotlin coroutines dependency in app level build.gradle.kts
Reference URL - https://developer.android.com/kotlin/coroutines
```
dependencies {
    // Add Coroutines dependency
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
}
```

## 4. Add LifeCycle dependency in app level build.gradle.kts (ViewModel Dependency, LiveData Dependency)
Reference URL -  https://developer.android.com/jetpack/androidx/releases/lifecycle
```
dependencies {
    // LifeCycle
    val lifecycle_version = "2.8.5"
    // ViewModel
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version")
    // LiveData
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version")
}
```

## 5. Add plugin id kotlin kapt in app level build.gradle.kts
```
plugins {
    id("kotlin-kapt")
}
```

## 6. Add dependency for Annotation processor in app level build.gradle.kts
Reference URL -  https://developer.android.com/jetpack/androidx/releases/lifecycle
```
dependencies {
    // Annotation processor
    kapt("androidx.lifecycle:lifecycle-compiler:$lifecycle_version")
}
```

## 7. Logging Interceptor (okhttp library) dependency in app level build.gradle.kts
Reference URL - https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor
```
dependencies {
    /** Logging Interceptor **/
    implementation("com.squareup.okhttp3:logging-interceptor:4.12.0")
}
```

##8. Add Permissions in AndroidManifest.xml
```
    <uses-permission android:name="android.permission.INTERNET"/>
    <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"/>
    <uses-permission android:name="android.permission.ACCESS_WIFI_STATE"/>
```

## Using Retrofit - There are 3 steps to use Retrofit Library.
- Data Classes :- (Create POJO(Plain Old Java Object) class that automatically parse the JSON data using Gson in background)
             fast method is using  https://www.jsonschema2pojo.org/  platform.
             To serialize JSON we require a converter.
- Service Interface/ API :- we need to create an Interface to define our different methods that will be used for network transactions.
- Retrofit Instance :- Since we are using Retrofit for Network calls, let's create a class that provides us the instance of the Retrofit.
                                 This should be Singleton class


## JSONPlaceholder
- Free fake and reliable API for testing and prototyping - https://jsonplaceholder.typicode.com/
- Sample API URL - https://jsonplaceholder.typicode.com/albums

## 1. Create Data Classes
Albums.kt   and AlbumItem.kt

## 2. Create an Interface
AlbumService.kt

## 3. Create Retrofit Instance
RetrofitInstance.kt