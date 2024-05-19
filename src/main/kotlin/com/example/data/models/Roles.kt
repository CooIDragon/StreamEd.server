package com.example.data.models

import com.example.utils.Constants

enum class Roles {
    STUDENT, PROFESSOR, ADMIN
}

fun String.getRoleByString() : Roles {
    return when(this) {
        Constants.Role.PROFESSOR -> Roles.PROFESSOR
        Constants.Role.ADMIN -> Roles.ADMIN
        else -> Roles.STUDENT
    }
}

fun Roles.getStringByRole() : String {
    return when(this) {
        Roles.PROFESSOR -> Constants.Role.PROFESSOR
        Roles.ADMIN -> Constants.Role.ADMIN
        else -> Constants.Role.STUDENT
    }
}