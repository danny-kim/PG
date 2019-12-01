package com.apatek.pg.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.apatek.pg.R

class EventActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event)
    }

    companion object {
        fun launch(context: Context) {
            context.startActivity(Intent(context, EventActivity::class.java))
        }
    }
}