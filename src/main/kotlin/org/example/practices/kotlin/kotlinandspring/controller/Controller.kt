package org.example.practices.kotlin.kotlinandspring.controller

import org.example.practices.kotlin.kotlinandspring.entities.User
import org.example.practices.kotlin.kotlinandspring.repository.UserRepository
import org.springframework.data.crossstore.ChangeSetPersister
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller (private val repository: UserRepository) {

    @GetMapping("/user/{id}")
    fun getUser(@PathVariable("id") id: Long): User {
        return repository.findUserById(id) ?: throw ChangeSetPersister.NotFoundException()
    }

    @PostMapping("/user")
    fun createUser(@RequestBody user: User): User {
        repository.save(user)
        return user
    }

}