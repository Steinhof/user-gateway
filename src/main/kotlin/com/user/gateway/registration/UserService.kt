package com.user.gateway.registration

import org.springframework.stereotype.Service


@Service
class UserService(private val userRepository: UserRepository) {

    fun createUser(login: String, password: String): User {
        return userRepository.save(User(login, password))
    }
}