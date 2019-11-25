package com.nguyenno.apps

import com.nguyenno.apps.projects.Project
import com.nguyenno.apps.rest.MemSourceService
import grails.plugin.cache.Cacheable
import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired

@CompileStatic
class ProjectService {
    @Autowired
    MemSourceService memSourceService

    @Cacheable('projectListResult')
    List<Project> getList(User user) {
        if (!memSourceService.amILogIn()) {
            memSourceService.loginToSession(user)
        }
        memSourceService.getListOfProjects().getContent()
    }
}
