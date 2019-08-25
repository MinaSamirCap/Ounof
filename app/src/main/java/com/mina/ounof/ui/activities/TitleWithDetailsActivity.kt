package com.mina.ounof.ui.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mina.ounof.R
import com.mina.ounof.ui.activities.base.BackActivity

class TitleWithDetailsActivity : BackActivity() {
    override fun getTitleRes(): Int {
        return R.string.songs
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_title_with_details)
    }

    companion object {
        @JvmStatic
        fun open(context: Context, title: String, body: Int) {
            val intent = Intent(context, SongsActivity::class.java)

            context.startActivity(intent)
        }
    }
}
