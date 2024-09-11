package org.example.practices.kotlin.kotlinandspring.entities

import java.time.LocalDateTime
import javax.persistence.*

@Entity
@Table(name = "users")
class User(
    var login: String,
    var firstname: String,
    var lastname: String,
    var description: String? = null,
    var createdAt: LocalDateTime? = LocalDateTime.now(),
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE) var id: Long? = null
)