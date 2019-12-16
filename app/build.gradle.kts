plugins {
    id(Android.Plugins.APPLICATION)
    kotlin(Kotlin.Plugins.ANDROID)
    kotlin(Kotlin.Plugins.ANDROID_EXTENSIONS)
    kotlin(Kotlin.Plugins.KAPT)
    id(Android.Plugins.NAVIGATION)
}

android {
    compileSdkVersion(AppConfig.COMPILE_VERSION)
    defaultConfig {
        applicationId = AppConfig.APPLICATION_ID
        minSdkVersion(AppConfig.MIN_VERSION)
        targetSdkVersion(AppConfig.TARGET_VERSION)
        versionCode = AppConfig.versionCode
        versionName = AppConfig.versionName
        testInstrumentationRunner = AppConfig.TEST_INSTRUMENTATION_RUNNER
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        val options = this as org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions
        options.jvmTarget = "1.8"
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    kapt(Other.Compilers.GLIDE)
    kapt(Android.Compilers.ROOM)

    implementation(Kotlin.Libraries.STDLIB)
    implementation(Android.Libraries.APPCOMPAT)
    implementation(Android.Libraries.CONSTRAINT_LAYOUT)
    implementation(Kotlin.Libraries.COROUTINES_ANDROID)
    implementation(Kotlin.Libraries.COROUTINES_CORE)
    implementation(Android.Libraries.FRAGMENT)
    implementation(Other.Libraries.GLIDE)
    implementation(Other.Libraries.GSON)
    implementation(Android.Libraries.KTX)
    implementation(Android.Libraries.LIFECYCLE_EXTENSIONS)
    implementation(Android.Libraries.LIVEDATA)
    implementation(Android.Libraries.MATERIAL)
    implementation(Android.Libraries.NAVIGATION_FRAGMENT)
    implementation(Android.Libraries.NAVIGATION_UI)
    implementation(Android.Libraries.RECYCLERVIEW)
    implementation(Other.Libraries.RETROFIT)
    implementation(Other.Libraries.RETROFIT_GSON)
    implementation(Android.Libraries.ROOM_KTX)
    implementation(Android.Libraries.ROOM_RUNTIME)
    implementation(Android.Libraries.VIEWMODEL)
    implementation(Android.Libraries.VIEWPAGER)
    implementation(Android.Libraries.WORK)
    implementation(Other.Libraries.CAVEROCK)

    androidTestImplementation(Android.TestingLibraries.CORE_TESTING)
    androidTestImplementation(Android.TestingLibraries.ESPRESSO_CONTRIB)
    androidTestImplementation(Android.TestingLibraries.ESPRESSO_CORE)
    androidTestImplementation(Android.TestingLibraries.ESPRESSO_INTENTS)
    testImplementation(Other.TestingLibraries.JUNIT)
    androidTestImplementation(Other.TestingLibraries.TRUTH)
    androidTestImplementation(Android.TestingLibraries.TEST_EXT)
    androidTestImplementation(Android.TestingLibraries.UI_AUTOMATOR)
    androidTestImplementation(Android.TestingLibraries.WORK)
}
