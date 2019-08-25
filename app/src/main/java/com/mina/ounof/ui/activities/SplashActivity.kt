package com.mina.ounof.ui.activities

import android.os.Bundle
import android.os.Handler
import com.mina.ounof.MainActivity
import com.mina.ounof.R
import com.mina.ounof.ui.activities.base.BaseActivity

class SplashActivity : BaseActivity() {

    private val SPLASH_TIME_OUT = 1500

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            // finish the current activity
            MainActivity.open(this@SplashActivity)
            finish()
        }, SPLASH_TIME_OUT.toLong())
    }


    override fun onBackPressed() {

    }
}
