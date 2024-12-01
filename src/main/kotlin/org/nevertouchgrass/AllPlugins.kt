package org.nevertouchgrass

import org.gradle.api.Plugin
import org.gradle.api.Project

abstract class AllPlugins : Plugin<Project> {
    override fun apply(project: Project) {
        project.pluginManager.apply("org.nevertouchgrass.push.plugin")
    }
}