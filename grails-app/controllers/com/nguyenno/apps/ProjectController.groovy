package com.nguyenno.apps

import com.nguyenno.apps.projects.Project
import grails.converters.JSON
import groovy.transform.CompileStatic

@CompileStatic
class ProjectController {

    ProjectService projectService
    UserService userService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def getLists() {
        User user = (User) userService.getFirstUser()
        if(user != null) {
            List<Project> listOfProjects = projectService.getList(user)
            def result = ["data": listOfProjects.toArray()]
            render(result as JSON)
        }else {
            def result = ["data": []]
            render(result as JSON)
        }
    }

    def index() {
    }
}
