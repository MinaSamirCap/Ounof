package com.mina.ounof.ui.activities.base

import android.os.Bundle
import android.view.MenuItem

val TITLE = "title"
val DETAILS = "details"
val STYLE = "style"

abstract class TitleActivity : BackActivity() {

    override fun getTitleRes(): String = intent.getStringExtra(TITLE)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }

        return super.onOptionsItemSelected(item)
    }
}