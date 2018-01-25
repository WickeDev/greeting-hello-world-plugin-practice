package net.codesanctum.plugin

import org.gradle.api.tasks.TaskAction
import org.gradle.api.DefaultTask


open class Greeting : DefaultTask() {
    var message: String? = null
    var recipient: String? = null

    @TaskAction
    internal fun sayGreeting() {
        System.out.printf("%s, %s!\n", message, recipient)
    }
}