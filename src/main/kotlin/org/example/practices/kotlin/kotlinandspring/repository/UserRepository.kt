package org.example.practices.kotlin.kotlinandspring.repository

import org.example.practices.kotlin.kotlinandspring.entities.User
import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Long> {

    fun findUserById(id: Long): User?

    fun save(user: User): User
}