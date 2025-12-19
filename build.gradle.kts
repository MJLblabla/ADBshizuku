
// Top-level build file where you can add configuration options common to all sub-projects/modules.

// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    dependencies {
        // classpath("io.realm.kotlin:gradle-plugin:2.0.0-SNAPSHOT")
        classpath ("com.github.aasitnikov:fat-aar-android:1.4.4")
    }
}
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.android.library) apply false
}