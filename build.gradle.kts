// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    repositories {
        google()
        jcenter()
        mavenCentral()
        maven {
            url = uri("https://jitpack.io")
        }
    }
    dependencies {
        classpath(Android.Plugins.AGP)
        classpath(Kotlin.Plugins.GRADLE)
        classpath(Android.Plugins.NAVIGATION_GRADLE)
    }
}

plugins {
    id(Other.Plugins.SPOTLESS) version Other.Versions.SPOTLESS
}

allprojects {
    repositories {
        google()
        jcenter()
        
    }
}

spotless {
    kotlin {
        target("**/*.kt")
        ktlint(Other.Versions.KTLINT).userData(mapOf("max_line_length" to "100"))
    }
}
