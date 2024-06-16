package com.streamed.plugins

import com.streamed.domain.usecase.CourseUseCase
import com.streamed.domain.usecase.UserUseCase
import com.streamed.domain.usecase.UsersCourseUseCase
import com.streamed.domain.usecase.WebinarUseCase
import com.streamed.routes.CourseRoute
import com.streamed.routes.SubscribeRoute
import com.streamed.routes.UserRoute
import com.streamed.routes.WebinarRoute
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting(userUseCase: UserUseCase, courseUseCase: CourseUseCase, webinarUseCase: WebinarUseCase, usersCourseUseCase: UsersCourseUseCase) {
    routing {
        UserRoute(userUseCase = userUseCase)
        CourseRoute(courseUseCase = courseUseCase)
        WebinarRoute(webinarUseCase = webinarUseCase)
        SubscribeRoute(usersCourseUseCase = usersCourseUseCase)
    }
}
