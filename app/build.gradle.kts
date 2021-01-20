plugins {
    id(Dependencies.Plugins.application)
    id(Dependencies.Plugins.kotlinAndroid)
    id(Dependencies.Plugins.kapt)
}

android {
    compileSdkVersion(Dependencies.App.compileSdk)
    buildToolsVersion(Dependencies.App.buildTools)

    defaultConfig {
        applicationId = Dependencies.App.id
        minSdkVersion(Dependencies.App.minSdk)
        targetSdkVersion(Dependencies.App.targetSdk)
        versionCode = Dependencies.App.versionCode
        versionName = Dependencies.App.versionName

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(fileTree(Dependencies.Common.fileTree))
    implementation(Dependencies.Androidx.constraint)
    implementation(Dependencies.Androidx.navFragment)
    implementation(Dependencies.Androidx.navUiKtx)

    testImplementation(Dependencies.Test.JUnit4)
    androidTestImplementation(Dependencies.Test.extJunit)
    androidTestImplementation(Dependencies.Test.espresso)
}
