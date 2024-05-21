package com.streamed.data.models

import io.ktor.server.auth.*

data class UserModel (
    val id: Int,
    val name: String,
    val surname: String,
    val password: String,
    val email: String,
    val role: Roles,
    val isActive: Boolean = false,
): Principal
