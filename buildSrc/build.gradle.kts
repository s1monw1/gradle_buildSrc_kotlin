//In the `buildSrc` we can easily provide code for the Gradle build script itself, namely we create custom Gradle tasks here.
// Learn about this feature here: https://zeroturnaround.com/rebellabs/using-buildsrc-for-custom-logic-in-gradle-builds/
// and here: https://docs.gradle.org/current/userguide/organizing_gradle_projects.html#sec:build_sources

plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

dependencies {
    compile("mysql:mysql-connector-java:5.1.24")
}