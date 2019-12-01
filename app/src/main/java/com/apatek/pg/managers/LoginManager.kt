package com.apatek.pg.managers

import android.text.TextUtils

class LoginManager(private val loginCallback: LoginCallback) {


    fun onLogin(username: String, password: String) {
        if (validation(username, password)){

        }
    }

    private fun validation(username: String, password: String): Boolean {
        if (TextUtils.isEmpty(username.trim())) {
            loginCallback.onValidationFailed("What's your username?")
            return false
        }
        if (TextUtils.isEmpty(password.trim())) {
            loginCallback.onValidationFailed("What's your password?")
            return false
        }
        return true
    }

    interface LoginCallback {
        fun onLoginSuccess()
        fun onLoginFailed()
        fun onValidationFailed(message: String)
    }

}