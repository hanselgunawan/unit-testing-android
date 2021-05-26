package com.hanseltritama.unittestingandroid.util

object RegistrationUtil {

    private val existingUsers = listOf("Peter", "Carl")

    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ) : Boolean {
        if (username.isEmpty() || password.isEmpty()) {
            return false
        }
        if (username in existingUsers) {
            return false
        }
        if (confirmedPassword != password) {
            return false
        }
        if (password.count { it.isDigit() } < 2) {
            return false
        }
        return true
    }

}