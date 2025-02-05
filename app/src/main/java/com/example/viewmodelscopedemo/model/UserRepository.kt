package com.example.viewmodelscopedemo.model

import kotlinx.coroutines.delay

class UserRepository {
    suspend fun getUsers() : List<User>{
        delay(8000)
        val users : List<User> = listOf(
            User(1, "Daya"),
            User(2, "Tata"),
            User(3, "Kaka"),
            User(4, "Baba")
        )
        return  users
    }
}