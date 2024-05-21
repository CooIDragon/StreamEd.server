package com.streamed.data.repository

import com.streamed.data.models.UsersCourseModel
import com.streamed.data.models.tables.UsersCourseTable
import com.streamed.domain.repository.UsersCourseRepository
import com.streamed.plugins.DatabaseFactory.dbQuery
import org.jetbrains.exposed.sql.insert

class UsersCourseRepositoryImpl: UsersCourseRepository {
    override suspend fun subscribeUser(usersCourseModel: UsersCourseModel) {
        dbQuery {
            UsersCourseTable.insert {
                table ->
                table[userId] = usersCourseModel.userId
                table[courseId] = usersCourseModel.courseId
            }
        }
    }

    override suspend fun unsubscribeUser(userId: Int, courseId: Int) {
        TODO("Not yet realized")
    }
}