package com.apatek.pg

import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import org.json.JSONObject

class RequestManager {

    fun execute(
        method: Int = Request.Method.GET,
        url: String,
        response: Response.Listener<JSONObject>,
        error: Response.ErrorListener
    ) {
        val jsonObjectRequest = JsonObjectRequest(method, url, null, response, error)

    }
}