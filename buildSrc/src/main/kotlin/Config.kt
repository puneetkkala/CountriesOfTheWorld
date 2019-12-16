object AppConfig {
    const val APP_NAME = "Countries of the World"
    const val APPLICATION_ID = "xyz.kalapuneet.c3"

    const val COMPILE_VERSION = 28
    const val MIN_VERSION = 23
    const val TARGET_VERSION = COMPILE_VERSION

    private const val MAJOR_NUMBER = 1
    private const val MINOR_NUMBER = 0
    private const val PATCH_NUMBER = 0

    val versionCode: Int
        get() {
            return (MAJOR_NUMBER * 10000) + (MINOR_NUMBER * 100) + PATCH_NUMBER
        }

    val versionName: String
        get() {
            return "$MAJOR_NUMBER.$MINOR_NUMBER.$PATCH_NUMBER"
        }

    const val TEST_INSTRUMENTATION_RUNNER = "androidx.test.runner.AndroidJUnitRunner"
}

object Kotlin {

    object Versions {
        const val KOTLIN = "1.3.61"
        const val COROUTINES = "1.3.0-M2"
    }

    object Plugins {
        const val GRADLE = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}"
        const val ANDROID = "android"
        const val ANDROID_EXTENSIONS = "android.extensions"
        const val KAPT = "kapt"
    }

    object Libraries {
        const val STDLIB = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.KOTLIN}"
        const val COROUTINES_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINES}"
        const val COROUTINES_CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINES}"
    }
}

object Android {

    object Versions {
        const val AGP = "3.5.3"
        const val APPCOMPAT = "1.1.0"
        const val CONSTRAINT_LAYOUT = "2.0.0-beta3"
        const val CORE_TESTING = "2.0.0"
        const val ESPRESSO = "3.1.1"
        const val FRAGMENT = "1.1.0-alpha09"
        const val KTX = "1.0.2"
        const val LIFECYCLE = "2.2.0-alpha01"
        const val MATERIAL = "1.1.0-alpha09"
        const val NAVIGATION = "2.0.0"
        const val RECYCLERVIEW = "1.1.0-alpha05"
        const val ROOM = "2.1.0"
        const val TEST_EXT = "1.1.0"
        const val UI_AUTOMATOR = "2.2.0"
        const val VIEW_PAGER = "1.0.0"
        const val WORK = "2.1.0"
    }

    object Plugins {
        const val AGP = "com.android.tools.build:gradle:${Versions.AGP}"
        const val APPLICATION = "com.android.application"
        const val NAVIGATION = "androidx.navigation.safeargs.kotlin"
        const val NAVIGATION_GRADLE = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.NAVIGATION}"
    }

    object Compilers {
        const val ROOM = "androidx.room:room-compiler:${Versions.ROOM}"
    }

    object Libraries {
        const val APPCOMPAT = "androidx.appcompat:appcompat:${Versions.APPCOMPAT}"
        const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"
        const val FRAGMENT = "androidx.fragment:fragment-ktx:${Versions.FRAGMENT}"
        const val KTX = "androidx.core:core-ktx:${Versions.KTX}"
        const val LIFECYCLE_EXTENSIONS = "androidx.lifecycle:lifecycle-extensions:${Versions.LIFECYCLE}"
        const val LIVEDATA = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.LIFECYCLE}"
        const val MATERIAL = "com.google.android.material:material:${Versions.MATERIAL}"
        const val NAVIGATION_FRAGMENT = "androidx.navigation:navigation-fragment-ktx:${Versions.NAVIGATION}"
        const val NAVIGATION_UI = "androidx.navigation:navigation-ui-ktx:${Versions.NAVIGATION}"
        const val RECYCLERVIEW = "androidx.recyclerview:recyclerview:${Versions.RECYCLERVIEW}"
        const val ROOM_KTX = "androidx.room:room-ktx:${Versions.ROOM}"
        const val ROOM_RUNTIME = "androidx.room:room-runtime:${Versions.ROOM}"
        const val VIEWMODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE}"
        const val VIEWPAGER = "androidx.viewpager2:viewpager2:${Versions.VIEW_PAGER}"
        const val WORK = "androidx.work:work-runtime-ktx:${Versions.WORK}"
    }

    object TestingLibraries {
        const val CORE_TESTING = "androidx.arch.core:core-testing:${Versions.CORE_TESTING}"
        const val ESPRESSO_CONTRIB = "androidx.test.espresso:espresso-contrib:${Versions.ESPRESSO}"
        const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO}"
        const val ESPRESSO_INTENTS = "androidx.test.espresso:espresso-intents:${Versions.ESPRESSO}"
        const val TEST_EXT = "androidx.test.ext:junit:${Versions.TEST_EXT}"
        const val UI_AUTOMATOR = "androidx.test.uiautomator:uiautomator:${Versions.UI_AUTOMATOR}"
        const val WORK = "androidx.work:work-testing:${Versions.WORK}"
    }
}

object Other {

    object Versions {
        const val GLIDE = "4.10.0"
        const val GSON = "2.8.2"
        const val JUNIT = "4.12"
        const val KTLINT = "0.33.0"
        const val RETROFIT = "2.6.3"
        const val SPOTLESS = "3.24.0"
        const val TRUTH = "0.42"
        const val CAVEROCK = "1.4"
    }

    object Plugins {
        const val SPOTLESS = "com.diffplug.gradle.spotless"
    }

    object Compilers {
        const val GLIDE = "com.github.bumptech.glide:compiler:${Versions.GLIDE}"
    }

    object Libraries {
        const val GLIDE = "com.github.bumptech.glide:glide:${Versions.GLIDE}"
        const val GSON = "com.google.code.gson:gson:${Versions.GSON}"
        const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
        const val RETROFIT_GSON = "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT}"
        const val CAVEROCK = "com.caverock:androidsvg-aar:${Versions.CAVEROCK}"
    }

    object TestingLibraries {
        const val JUNIT = "junit:junit:${Versions.JUNIT}"
        const val TRUTH = "com.google.truth:truth:${Versions.TRUTH}"
    }
}
