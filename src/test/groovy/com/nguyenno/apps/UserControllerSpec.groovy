package com.nguyenno.apps

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class UserControllerSpec extends Specification implements ControllerUnitTest<UserController> {

    void "Test the index action returns the correct model"() {
        given:
        controller.userService = Mock(UserService) {
            list() >> [new User(userName: 'John', password: 'password1'), new User(userName: 'Charles', password: 'password2')]
        }

        when:"The index action is executed"
        controller.index()

        then:"The model is correct"
        model.userList.size() == 2
        model.userList[0].userName == 'John'
        model.userList[0].password == 'password1'
        model.userList[1].userName == 'Charles'
        model.userList[1].password == 'password2'
    }
}
