package com.apatek.pg.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.apatek.pg.R

class ForgotPasswordActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
    }

    companion object {
        fun launch(context: Context) {
            context.startActivity(Intent(context, ForgotPasswordActivity::class.java))
        }
    }
}