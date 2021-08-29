package com.user.gateway.registration

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException


@RestController
@RequestMapping("user")
class RegistrationController(
    val userService: UserService,
    val userRepository: UserRepository
) {

    @PostMapping
    fun createUser(@RequestBody request: CreateUserRequest): User {
        val login = request.login
        val password = request.password


        if (userRepository.existsByLogin(login)) {
            throw ResponseStatusException(HttpStatus.BAD_REQUEST, "User exists");
        }

        return userService.createUser(login, password)
    }
}