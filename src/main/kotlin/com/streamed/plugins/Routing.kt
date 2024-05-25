package com.streamed.plugins

import com.streamed.domain.usecase.CourseUseCase
import com.streamed.domain.usecase.UserUseCase
import com.streamed.domain.usecase.UsersCourseUseCase
import com.streamed.routes.CourseRoute
import com.streamed.routes.UserRoute
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting(userUseCase: UserUseCase, courseUseCase: CourseUseCase) {
    routing {
        UserRoute(userUseCase = userUseCase)
        CourseRoute(courseUseCase = courseUseCase)
    }
}
