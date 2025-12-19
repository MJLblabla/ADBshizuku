plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    id("com.kezong.fat-aar")
}

android {
    namespace = "com.blabla.shizuku.sdk"
    compileSdk = 36

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

fataar {
    transitive = true
}


dependencies {
    embed(project(":comp-depslib:adb-adi"))
    embed(project(":comp-depslib:adb-aidl"))
    embed(project(":comp-depslib:adb-common"))
    embed(project(":comp-depslib:adb-manager"))
    embed(project(":comp-depslib:adb-provider"))
    embed(project(":comp-depslib:adb-rish"))
    embed(project(":comp-depslib:adb-server"))
    embed(project(":comp-depslib:adb-server-share"))
    embed(project(":comp-depslib:adb-shared"))
    embed(project(":comp-depslib:adb-start"))

    api("io.github.vvb2060.ndk:boringssl:2.1")
    api("dev.rikka.ndk.thirdparty:cxx:1.2.0")
    api("org.lsposed.hiddenapibypass:hiddenapibypass:6.1")
    api("org.bouncycastle:bcpkix-jdk15on:1.70")
    api("me.zhanghai.android.appiconloader:appiconloader:1.5.0")
    api("com.github.topjohnwu.libsu:core:6.0.0")
    api("dev.rikka.rikkax.core:core-ktx:1.4.1")
    // Hidden API
    api("dev.rikka.hidden:compat:4.3.3")
    api("dev.rikka.hidden:stub:4.3.3")
    // Refine
    api("dev.rikka.tools.refine:runtime:4.3.0")
    api("dev.rikka.tools.refine:annotation:4.3.0")
    annotationProcessor("dev.rikka.tools.refine:annotation-processor:4.3.0")

}