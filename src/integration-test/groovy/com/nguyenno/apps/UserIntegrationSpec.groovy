package com.nguyenno.apps;

import grails.gorm.transactions.Rollback;
import grails.testing.mixin.integration.Integration
import org.hibernate.SessionFactory;
import spock.lang.Specification;

@Integration
@Rollback
class UserIntegrationSpec extends Specification {
    UserService userService
    SessionFactory sessionFactory

    private Long setupData(){
        new User(userName: 'John', password: 'password1').save(flush:true, failOnError: true)
        User user =new User(userName: 'Jensen', password: 'password2').save(flus:true, failOnError: true)
        user.id
    }

    void 'test get'(){
        Long id = setupData()

        expect:
        User user = userService.get(id)
        user.userName == 'Jensen'
        user.password == 'password2'
    }

    void 'test list'(){
        setupData()

        when:
        List<User> userList = userService.list()

        then:
        userList.size() == 2
        userList[0].password == 'password1'
        userList[1].password == 'password2'
    }

    void 'test delete'(){
        Long id = setupData()

        expect:
        userService.list().size() == 2

        when:
        userService.delete(id)
        sessionFactory.currentSession.flush()

        then:
        userService.list().size() == 1
    }

    void 'test save'(){
        when:
        User user = new User(userName: 'Mike', password: 'password3')
        userService.save(user)

        then:
        user.id != null
    }

    void 'test get first user'(){
        setupData()
        expect:
        User user = userService.getFirstUser()
        user.userName == 'John'
        user.password == 'password1'
    }

    void 'test get first user if list is empty'(){
        expect:
        User user = userService.getFirstUser()
        user == null
    }
}
