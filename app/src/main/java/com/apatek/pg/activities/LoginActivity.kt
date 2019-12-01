package com.apatek.pg.activities

import android.support.v7.app.AppCompatActivity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.animation.AlphaAnimation
import android.view.animation.LinearInterpolator
import android.widget.TextView
import androidx.core.app.ActivityOptionsCompat
import com.apatek.pg.R


class LoginActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val alpha = AlphaAnimation(0f, 1f)
        alpha.duration = 500
        alpha.interpolator = LinearInterpolator()
        alpha.fillAfter = false
        main_login.startAnimation(alpha)


        button_login.setOnClickListener { HomeActivity.launchClear(this) }

        tv_forgot_password.setOnClickListener { ForgotPasswordActivity.launch(this) }
    }

    companion object {
        fun launch(context: Context, viewId: TextView) {
            val activityOptionsCompat =
                ActivityOptionsCompat.makeSceneTransitionAnimation(
                    context as AppCompatActivity,
                    viewId,
                    "textAppName"
                )
            val intent = Intent(
                context,
                LoginActivity::class.java
            )
            context.startActivity(intent, activityOptionsCompat.toBundle())
        }
    }
}