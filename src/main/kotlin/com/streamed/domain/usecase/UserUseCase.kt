package com.streamed.domain.usecase

import com.auth0.jwt.JWTVerifier
import com.streamed.auth.JwtService
import com.streamed.data.models.UserModel
import com.streamed.domain.repository.UserRepository

class UserUseCase (
    private val repositoryImpl: UserRepository,
    private val jwtService: JwtService
) {

    suspend fun createUser(userModel: UserModel) = repositoryImpl.insertUser(userModel = userModel)

    suspend fun findUserByEmail(email: String) = repositoryImpl.getUserByEmail(email = email)

    fun generateToken(userModel: UserModel): String = jwtService.generateToken(user = userModel)

    fun getJwtVerifier(): JWTVerifier = jwtService.getVerifier()
}