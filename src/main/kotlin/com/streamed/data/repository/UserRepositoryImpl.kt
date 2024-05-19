package com.streamed.data.repository

import com.streamed.data.models.UserModel
import com.streamed.data.models.getRoleByString
import com.streamed.data.models.getStringByRole
import com.streamed.data.models.tables.UserTable
import com.streamed.domain.repository.UserRepository
import com.streamed.plugins.DatabaseFactory.dbQuery
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.insert

class UserRepositoryImpl: UserRepository {
    override suspend fun getUserByEmail(email: String): UserModel? {
        return dbQuery {
            UserTable.select {
                UserTable.email.eq(email)
            }
                .map {rowToUser(row = it)}
                .singleOrNull()
        }
    }

    override suspend fun insertUser(user: UserModel) {
        return dbQuery {
            UserTable.insert {
                table ->
                table[name] = user.name
                table[surname] = user.surname
                table[email] = user.email
                table[password] = user.password
                table[role] = user.role.getStringByRole()
                table[isActive] = user.isActive
            }
        }
    }

    private fun rowToUser(row: ResultRow?): UserModel? {
        if (row == null) {
            return null
        }

        return UserModel(
            id = row[UserTable.id],
            name = row[UserTable.name],
            surname = row[UserTable.surname],
            email = row[UserTable.email],
            password = row[UserTable.password],
            role = row[UserTable.role].getRoleByString(),
            isActive = row[UserTable.isActive]
        )
    }

}