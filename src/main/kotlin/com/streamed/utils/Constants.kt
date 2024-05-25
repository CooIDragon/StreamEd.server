package com.streamed.utils

class Constants {
    object Role {
        const val STUDENT = "student"
        const val PROFESSOR = "professor"
        const val ADMIN = "admin"
    }

    object Error {
        const val GENERAL = "Oh, something went wrong!"
        const val WRONG_EMAIL = "Wrong email address!"
        const val INCORRECT_PASSWORD = "Incorrect password"
        const val MISSING_FIELDS = "Missing some fields!"
        const val USER_NOT_FOUND = "Opps, user not found"
        const val ACCESS_RESTRICTED = "Access restricted!"
    }

    object Success {
        const val COURSE_ADDED_SUCCESSFULLY = "Course Added Successfully!"
        const val COURSE_UPDATE_SUCCESSFULLY = "Course Updated Successfully!"
        const val COURSE_DELETED_SUCCESSFULLY = "Course Deleted Successfully!"
    }

    object Value {
        const val ID = "id"
    }
}