package com.kotlinexpertise.tasks

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

open class Task2 : DefaultTask() {

    init {
        group = "com.kotlinexpertise"
        description = "task 2"
    }

    @TaskAction
    fun run() {
        println("Task2 running")
    }
}
