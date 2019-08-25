package com.mina.ounof.ui.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.mina.ounof.R
import com.mina.ounof.utils.IntentUtils

class PrivacyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_privacy)

        supportActionBar?.title = getString(R.string.privacy)
    }

    fun openLink(view: View) {
        IntentUtils.openBrowser(this, getString(R.string.privacy_link))
    }

    companion object {
        fun open(context: Context) {
            context.startActivity(Intent(context, PrivacyActivity::class.java))
        }
    }


}
