package com.github.andrewaylett.intellijlua.services

import com.github.andrewaylett.intellijlua.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
