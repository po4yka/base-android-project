plugins {
    id(Dependencies.Plugins.javaLib)
    id(Dependencies.Plugins.kotlin)
}

dependencies {
    implementation(fileTree(Dependencies.Common.fileTree))
    implementation(Dependencies.Kt.stdJdk)
    api(Dependencies.Koin.core)
    api(Dependencies.Common.timber)
}