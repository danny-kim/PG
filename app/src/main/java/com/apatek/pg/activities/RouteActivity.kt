package com.apatek.pg.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.apatek.pg.R

class RouteActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_route)
    }

    companion object {
        fun launch(context: Context) {
            context.startActivity(Intent(context, RouteActivity::class.java))
        }
    }
}
