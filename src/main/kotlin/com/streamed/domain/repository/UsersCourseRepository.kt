package com.streamed.domain.repository

import com.streamed.data.models.UsersCourseModel

interface UsersCourseRepository {
    suspend fun subscribeUser(usersCourseModel: UsersCourseModel)
    suspend fun unsubscribeUser(userId: Int, courseId: Int)
}