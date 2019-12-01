package com.apatek.pg.requests

import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import org.json.JSONObject

class RequestManager {

    private val baseUrl = "http://3.0.98.235:98/"
    private val controller = "PG/entity/"

    fun execute(
        url: String,
        response: Response.Listener<JSONObject>,
        error: Response.ErrorListener,
        method: Int = Request.Method.GET
    ) {
        val jsonObjectRequest =
            JsonObjectRequest(method, "$baseUrl$controller$url", null, response, error)

    }
}