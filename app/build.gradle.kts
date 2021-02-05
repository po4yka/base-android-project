plugins {
    id(Dependencies.Plugins.application)
    id(Dependencies.Plugins.kotlinAndroid)
    id(Dependencies.Plugins.kapt)
}

android {
    compileSdkVersion(Dependencies.App.compileSdk)
    buildToolsVersion(Dependencies.App.buildTools)

    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_1_8)
        targetCompatibility(JavaVersion.VERSION_1_8)
    }

    defaultConfig {
        applicationId = Dependencies.App.id
        minSdkVersion(Dependencies.App.minSdk)
        targetSdkVersion(Dependencies.App.targetSdk)
        versionCode = Dependencies.App.versionCode
        versionName = Dependencies.App.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        viewBinding = true
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(Dependencies.Kt.stdLib)
    implementation(Dependencies.Kt.stdJdk)
    implementation(Dependencies.Kt.serialize)

    implementation(fileTree(Dependencies.Common.fileTree))
    implementation(Dependencies.Common.timber)

    implementation(Dependencies.Androidx.coreKtx)
    implementation(Dependencies.Androidx.appCompat)
    implementation(Dependencies.Androidx.constraint)

    implementation(Dependencies.Androidx.lifecycle)
    implementation(Dependencies.Androidx.lifecycleViewModel)

    implementation(Dependencies.Androidx.navFragment)
    implementation(Dependencies.Androidx.navUiKtx)

    implementation(Dependencies.Androidx.roomKt)
    implementation(Dependencies.Room.roomRuntime)
    implementation(Dependencies.Room.room)
    implementation(Dependencies.Room.roomCompiler)

    implementation(Dependencies.Network.retrofit)
    implementation(Dependencies.Network.gson)
    implementation(Dependencies.Network.ohttp)
    implementation(Dependencies.Network.loggingInterceptor)

    implementation(Dependencies.Google.material)

    testImplementation(Dependencies.Test.JUnit4)
    testImplementation(Dependencies.Test.robolectric)
    testImplementation(Dependencies.Test.extJunit)
    androidTestImplementation(Dependencies.Test.espresso)
    androidTestImplementation(Dependencies.Test.archCore)
}
