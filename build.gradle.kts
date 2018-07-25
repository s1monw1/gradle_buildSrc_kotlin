import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import com.kotlinexpertise.tasks.*


plugins {
    kotlin("jvm") version "1.2.51"
}

repositories {
    mavenCentral()
}

dependencies {
    compile(kotlin("stdlib-jdk8"))
}

task<Task1>("task1")
task<Task2>("task2")

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}