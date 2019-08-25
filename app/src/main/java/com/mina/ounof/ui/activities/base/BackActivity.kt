package com.mina.ounof.ui.activities.base

import android.os.Bundle
import androidx.annotation.StringRes

abstract class BackActivity : BaseActivity() {

    @StringRes
    abstract fun getTitleRes(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = getString(getTitleRes())

    }


}