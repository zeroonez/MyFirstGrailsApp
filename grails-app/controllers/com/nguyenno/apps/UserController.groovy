package com.nguyenno.apps

class UserController {

    def userService

    def index() {
        respond userService.list()
    }

    def show(Long id) {
        respond userService.get(id)
    }

    def create() {
        respond new User(params)
    }

    def save(User student) {
        userService.save(student)
        redirect action:"index", method:"GET"
    }

    def delete(Long id) {
        userService.delete(id)
        redirect action:"index", method:"GET"
    }
}
