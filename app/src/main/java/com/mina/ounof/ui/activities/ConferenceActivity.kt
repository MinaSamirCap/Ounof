package com.mina.ounof.ui.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mina.ounof.R
import com.mina.ounof.ui.activities.base.BackActivity

class ConferenceActivity : BackActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conference)

        setupClickListener()
    }

    private fun setupClickListener() {
        
    }

    override fun getTitleRes(): String = getString(R.string.conference)

    companion object {
        fun open(context: Context) {
            context.startActivity(Intent(context, ConferenceActivity::class.java))
        }
    }
}
