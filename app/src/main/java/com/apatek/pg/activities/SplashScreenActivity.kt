package com.apatek.pg.activities

import android.os.Bundle
import android.os.Handler
import com.apatek.pg.R
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreenActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        Handler().postDelayed({
            LoginActivity.launch(this, tv_app_name)
            Handler().postDelayed({
                finish()
            }, 1000)
        }, 3000)
    }
}