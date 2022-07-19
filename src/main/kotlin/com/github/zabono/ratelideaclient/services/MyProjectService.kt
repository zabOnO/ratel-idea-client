package com.github.zabono.ratelideaclient.services

import com.intellij.openapi.project.Project
import com.github.zabono.ratelideaclient.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
