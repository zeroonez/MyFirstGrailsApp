package com.nguyenno.apps

import com.nguyenno.apps.configs.MemsourceServiceConfig
import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration

import groovy.transform.CompileStatic
import org.springframework.context.annotation.Import

@CompileStatic
@Import(MemsourceServiceConfig.class)
class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        GrailsApp.run(Application, args)
    }
}