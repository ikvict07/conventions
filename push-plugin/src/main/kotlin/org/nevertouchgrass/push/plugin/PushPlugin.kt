package org.nevertouchgrass.push.plugin


import org.gradle.api.Plugin
import org.gradle.api.Project

@Suppress("UNUSED")
abstract class PushPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            plugins.apply("maven-publish")
            tasks.named("build").configure {
                it.finalizedBy(tasks.named("publishToMavenLocal"))
            }
        }
    }
}