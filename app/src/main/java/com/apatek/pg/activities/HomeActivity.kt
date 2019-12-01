package com.apatek.pg.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.apatek.pg.R
import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setStatusBarColor(R.color.colorPrimaryDark)

        ll_fixed_plan.setOnClickListener { PlanActivity.launch(this) }
        ll_route.setOnClickListener { RouteActivity.launch(this) }
        ll_event.setOnClickListener { EventActivity.launch(this) }
        ll_take_leave.setOnClickListener { TakeLeaveActivity.launch(this) }
        ll_late_early.setOnClickListener { TakeLateEarlyActivity.launch(this) }
        ll_report.setOnClickListener { ReportActivity.launch(this) }
    }

    override fun isStatusBarColorDark(): Boolean {
        return true
    }

    companion object {
        fun launchClear(context: Context) {
            val intent = Intent(context, HomeActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            context.startActivity(intent)
        }
    }
}
