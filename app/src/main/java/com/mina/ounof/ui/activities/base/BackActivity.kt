package com.mina.ounof.ui.activities.base

import android.os.Bundle

abstract class BackActivity : BaseActivity() {

    abstract fun getTitleRes(): String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = getTitleRes()

    }


}