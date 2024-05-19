package com.example.domain.repository

import com.example.data.models.UserModel

interface UserRepository {
    suspend fun getUserByEmail(email: String): UserModel?
    suspend fun insertUser(userModel: UserModel)
}