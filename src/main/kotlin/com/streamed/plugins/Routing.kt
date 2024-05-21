package com.streamed.plugins

import com.streamed.domain.usecase.UserUseCase
import com.streamed.routes.UserRoute
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting(userUseCase: UserUseCase) {
    routing {
        UserRoute(userUseCase = userUseCase)
    }
}
