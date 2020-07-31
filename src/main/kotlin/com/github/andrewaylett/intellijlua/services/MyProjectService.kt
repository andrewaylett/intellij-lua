package com.github.andrewaylett.intellijlua.services

import com.intellij.openapi.project.Project
import com.github.andrewaylett.intellijlua.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
