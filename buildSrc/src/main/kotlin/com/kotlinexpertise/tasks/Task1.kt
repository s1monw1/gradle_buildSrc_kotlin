package com.kotlinexpertise.tasks

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

open class Task1 : DefaultTask() {

    init {
        group = "com.kotlinexpertise"
        description = "task1"
    }


    @TaskAction
    fun run() {
        println("Task1 running")
    }
}
