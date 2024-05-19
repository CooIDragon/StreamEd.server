package com.example.data.repository

import com.example.data.models.UserModel
import com.example.domain.repository.UserRepository
import com.example.plugins.DatabaseFactory.dbQuery

class UserRepositoryImpl: UserRepository {
    override suspend fun getUserByEmail(email: String): UserModel? {
        TODO("Not yet implemented")
    }

    override suspend fun insertUser(userModel: UserModel) {
        TODO("Not yet implemented")
    }

}