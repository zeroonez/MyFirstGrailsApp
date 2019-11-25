package com.nguyenno.apps

import grails.gorm.transactions.Transactional

@Transactional
class UserService {

    def getFirstUser(){
        if(!User.list().isEmpty()){
            User.list().get(0);
        }
    }
    def get(id){
        User.get(id)
    }

    def list(){
        User.list()
    }

    def save(User){
        User.save()
    }

    def delete(id){
        User.get(id).delete()
    }
}
