package com.apatek.pg.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.apatek.pg.R

class TakeLeaveActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_take_leave)
    }

    companion object {
        fun launch(context: Context) {
            context.startActivity(Intent(context, TakeLeaveActivity::class.java))
        }
    }
}
