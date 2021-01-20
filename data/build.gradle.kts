plugins {
    id(Dependencies.Plugins.library)
    id(Dependencies.Plugins.kotlinAndroid)
    id(Dependencies.Plugins.kapt)
}

android {
    compileSdkVersion(Dependencies.App.compileSdk)
    buildToolsVersion(Dependencies.App.buildTools)

    defaultConfig {
        minSdkVersion(Dependencies.App.minSdk)
        targetSdkVersion(Dependencies.App.targetSdk)
        versionCode = Dependencies.App.versionCode
        versionName = Dependencies.App.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    implementation(fileTree(Dependencies.Common.fileTree))

    api(Dependencies.Kt.stdLib)
    api(Dependencies.Androidx.coreKtx)
    api(Dependencies.Androidx.appCompat)

    implementation(Dependencies.Androidx.roomRuntime)
    kapt(Dependencies.Androidx.roomCompiler)
    implementation(Dependencies.Androidx.roomKt)

    api(project(":domain"))

    testImplementation(Dependencies.Test.JUnit4)
    androidTestImplementation(Dependencies.Test.extJunit)
    androidTestImplementation(Dependencies.Test.espresso)
}
