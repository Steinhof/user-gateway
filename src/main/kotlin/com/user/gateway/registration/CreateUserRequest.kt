package com.user.gateway.registration


data class CreateUserRequest(
    val login: String,
    val password: String,
)
