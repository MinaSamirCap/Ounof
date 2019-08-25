package com.mina.ounof.ui.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import com.mina.ounof.R
import com.mina.ounof.ui.activities.base.BackActivity
import com.mina.ounof.utils.IntentUtils

class PrivacyActivity : BackActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_privacy)
    }

    fun openLink(view: View) {
        IntentUtils.openBrowser(this, getString(R.string.privacy_link))
    }

    companion object {
        fun open(context: Context) {
            context.startActivity(Intent(context, PrivacyActivity::class.java))
        }
    }

    override fun getTitleRes(): String = getString(R.string.privacy)


}
