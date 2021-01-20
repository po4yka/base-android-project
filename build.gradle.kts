import org.jlleitschuh.gradle.ktlint.reporter.ReporterType

buildscript {
    repositories {
        google()
        jcenter()
        maven("https://plugins.gradle.org/m2/")
    }

    dependencies {
        classpath(Dependencies.Plugins.buildGradle)
        classpath(Dependencies.Plugins.buildKotlin)
        classpath(Dependencies.Plugins.ktlintClasspath)
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register("clean").configure {
    delete("build")
}

apply(plugin = Dependencies.Plugins.ktlint)

configure<org.jlleitschuh.gradle.ktlint.KtlintExtension> {
    version.set("0.22.0")
    // Prints the name of failed rules
    verbose.set(true)
    debug.set(true)
    outputToConsole.set(true)
    outputColorName.set("RED")
    ignoreFailures.set(true)

    // Default "plain" reporter is actually harder to read.
    reporters {
        reporter(ReporterType.JSON)
        reporter(ReporterType.PLAIN)
        reporter(ReporterType.CHECKSTYLE)
    }
}
