package com.user.gateway.registration

import javax.persistence.*


@Entity
@Table(name = "user")
data class User(

    val login: String,

    val password: String,
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int = 0

    constructor() : this("", "")
}