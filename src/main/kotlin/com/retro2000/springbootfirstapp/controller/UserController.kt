package com.retro2000.springbootfirstapp.controller

import com.retro2000.springbootfirstapp.business.UserBusiness
import com.retro2000.springbootfirstapp.model.UserExercisesProto.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class UserController {

    @Autowired
    lateinit var userBusiness: UserBusiness

    @GetMapping("/welcome")
    fun welcome(): Map<String, Any> {
        return mapOf(
                Pair("welcome1", "Welcome to Java"),
                Pair("welcome2", "Welcome to String boot world!"),
                Pair("array", arrayListOf("teste1", "teste2"))
        )
    }

    @RequestMapping("/users/all")
    fun getUsers(): MutableList<User> {
        return userBusiness.findAllUsers()
    }

    @GetMapping("/user/{userId}")
    fun getUser(@PathVariable userId: Long): User {
        return userBusiness.findUserById(userId)
    }

    @RequestMapping("/user")
    fun putUser(user: User): User {
        return userBusiness.saveUser(user)
    }
}