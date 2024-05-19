package com.example.data.models.tables

import com.example.data.models.tables.CourseTable.autoIncrement
import org.jetbrains.exposed.sql.Column
import org.jetbrains.exposed.sql.Table

object UsersCourseTable: Table() {
    val user_id: Column<Int> = integer("user_id").references(UserTable.id)
    val course_id: Column<Int> = integer("course_id").references(CourseTable.id)
}