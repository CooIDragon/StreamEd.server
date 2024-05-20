package com.streamed.domain.usecase

import com.streamed.data.models.WebinarModel
import com.streamed.domain.repository.WebinarRepository


class WebinarUseCase (
    private val webinarRepository: WebinarRepository
) {
    suspend fun addWebinar(webinar: WebinarModel) {
        webinarRepository.addWebinar(webinar = webinar)
    }

    suspend fun getAllWebinars(courseId: Int) {
        webinarRepository.getAllWebinars(courseId)
    }

    suspend fun updateWebinar(webinar: WebinarModel) {
        webinarRepository.updateWebinar(webinar)
    }

    suspend fun deleteWebinar(webinarId: Int) {
        webinarRepository.deleteWebinar(webinarId)
    }
}