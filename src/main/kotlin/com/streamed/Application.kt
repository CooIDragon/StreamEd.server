package com.streamed

import com.streamed.auth.JwtService
import com.streamed.data.repository.CourseRepositoryImpl
import com.streamed.data.repository.UserRepositoryImpl
import com.streamed.data.repository.WebinarRepositoryImpl
import com.streamed.domain.repository.WebinarRepository
import com.streamed.domain.usecase.CourseUseCase
import com.streamed.domain.usecase.UserUseCase
import com.streamed.domain.usecase.WebinarUseCase
import com.streamed.plugins.DatabaseFactory.initDatabase
import com.streamed.plugins.configureMonitoring
import com.streamed.plugins.configureSecurity
import com.streamed.plugins.configureSerialization
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    val jwtService = JwtService()
    val userRepository = UserRepositoryImpl()
    val courseRepository = CourseRepositoryImpl()
    val webinarRepository = WebinarRepositoryImpl()
    val userUseCase = UserUseCase(userRepository, jwtService)
    val courseUseCase = CourseUseCase(courseRepository)
    val webinarUseCase = WebinarUseCase(webinarRepository)

    initDatabase()
    configureMonitoring()
    configureSerialization()
    configureSecurity(userUseCase)
}
