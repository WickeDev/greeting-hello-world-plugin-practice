package net.codesanctum.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project


open class GreetingPlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.tasks.create("hello", Greeting::class.java) { task ->
            task.message = "Hello"
            task.recipient = "World"
        }
    }
}