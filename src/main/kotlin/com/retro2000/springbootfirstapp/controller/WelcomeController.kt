package com.retro2000.springbootfirstapp.controller

import com.retro2000.springbootfirstapp.model.UserExercisesProto
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class WelcomeController {

    @GetMapping("/welcome")
    fun welcome(): Map<String, Any> {
        return mapOf(
                Pair("welcome1", "Welcome to Java"),
                Pair("welcome2", "Welcome to String boot world!"),
                Pair("array", arrayListOf("teste1", "teste2"))
        )
    }

    @RequestMapping("/user")
    fun getUser(): UserExercisesProto.User {
        return UserExercisesProto.User.newBuilder()
            .setId(1)
            .setNome("Joao Santo Cristo")
            .setEmail("joao@urban.io")
            .build()
    }
}