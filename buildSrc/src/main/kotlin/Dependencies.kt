object Dependencies {

    object Plugins {
        const val buildGradle = "com.android.tools.build:gradle:${Versions.buildGradle}"
        const val buildKotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kt}"
        const val application = "com.android.application"
        const val library = "com.android.library"
        const val kotlinAndroid = "kotlin-android"
        const val kapt = "kotlin-kapt"
        const val javaLib = "java-library"
        const val kotlin = "kotlin"
        const val ktlint = "org.jlleitschuh.gradle.ktlint"
        const val ktlintClasspath = "org.jlleitschuh.gradle:ktlint-gradle:${Versions.ktlint}"
    }

    object App {
        const val id = "com.po4yka.baseproject"
        const val minSdk = 23
        const val compileSdk = 30
        const val targetSdk = 30
        const val buildTools = "30.0.0"
        const val versionCode = 1
        const val versionName = "1.0"
    }

    object Kt {
        const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kt}"
        const val stdJdk = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kt}"
        const val serialize =
            "org.jetbrains.kotlinx:kotlinx-serialization-runtime:${Versions.serialize}"
    }

    object Androidx {
        const val coreKtx = "androidx.core:core-ktx:${Versions.ktxCore}"
        const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
        const val constraint = "androidx.constraintlayout:constraintlayout:${Versions.constraint}"
        const val navFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navFragment}"
        const val navUiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.navUiKtx}"

        const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
        const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
        const val roomKt = "androidx.room:room-ktx:${Versions.room}"

        const val prefs = "androidx.preference:preference-ktx:${Versions.prefs}"
    }

    object Common {
        val fileTree = mapOf("dir" to "libs", "include" to listOf("*.jar"))
        const val timber = "com.jakewharton.timber:timber:${Versions.timber}"
    }

    object Koin {
        const val core = "org.koin:koin-core:${Versions.koin}"
        const val scope = "org.koin:koin-androidx-scope:${Versions.koin}"
        const val viewModel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
    }

    object Room {
        const val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
        const val room = "androidx.room:room-ktx:${Versions.room}"
        const val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    }

    object Network {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
        const val gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
        const val ohttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
        const val loggingInterceptor =
            "com.squareup.okhttp3:logging-interceptor:${Versions.loggingInterceptor}"
    }

    object Test {
        const val JUnit4 = "junit:junit:${Versions.junit}"
        const val extJunit = "androidx.test.ext:junit:${Versions.extJunit}"
        const val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
        const val koin = "org.koin:koin-test:${Versions.koin}"
    }
}