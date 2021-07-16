# Android Base Project Automatic Creation

[![CodeStyle](https://img.shields.io/badge/code%20style-%E2%9D%A4-FF4081.svg)](https://ktlint.github.io/)
![Build](https://github.com/po4yka/base-android-project/workflows/BuildAndroidApp/badge.svg)
[![Kotlin Version](https://img.shields.io/badge/kotlin-1.5.10-blue.svg)](http://kotlinlang.org/)
[![Gradle](https://img.shields.io/badge/gradle-7.1.1-blue.svg)](https://lv.binarybabel.org/catalog/gradle/latest)
[![API](https://img.shields.io/badge/API-23%2B-blue.svg)](https://android-arsenal.com/api?level=23)
[![License](https://img.shields.io/badge/License-Apache%202.0-lightgrey.svg)](http://www.apache.org/licenses/LICENSE-2.0)

## Base usage

1. Press `Use this template` button on GitHub.
2. Run `setup.py` script for naming.
3. Run `./gradlew spotlessApply` to update the copyright across the project.
4. Run `./gradlew installGitHooks` task to install Git Hooks.
5. Update README.

## Other commands

### Static Analysis

* `./gradlew ktlintCheck` - check if the there are any lint issues.
* `./gradlew ktlintFormat` - format the code across the project.
* `./gradlew detekt` - analyze the source code with [detekt](https://github.com/detekt/detekt).

### Code Formatting

* `./gradlew spotlessCheck` - check if the copyright is up to date.
* `./gradlew spotlessApply` - update the copyright across the project.

### Dependency Updates

* `./gradlew dependencyUpdates` - generate dependency updates report

### generate dependency updates report

* `./gradlew dokkaHtml` - generate documentation in HTML format with [dokka](https://github.com/Kotlin/dokka)
