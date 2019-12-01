package com.apatek.pg.requests

import com.android.volley.Response

const val login = ""
fun login(username: String, password: String) {
    RequestManager().execute(login, Response.Listener {
    }, Response.ErrorListener {
    })
}