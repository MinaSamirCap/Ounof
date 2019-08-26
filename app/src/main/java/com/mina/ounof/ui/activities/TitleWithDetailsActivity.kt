package com.mina.ounof.ui.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.mina.ounof.R
import com.mina.ounof.ui.activities.base.DETAILS
import com.mina.ounof.ui.activities.base.STYLE
import com.mina.ounof.ui.activities.base.TITLE
import com.mina.ounof.ui.activities.base.TitleActivity
import kotlinx.android.synthetic.main.activity_title_with_details.*

class TitleWithDetailsActivity : TitleActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_title_with_details)

        details_text_view.text = intent.getStringExtra(DETAILS)

        if (intent.getBooleanExtra(STYLE, false)) {
            scroll_view.background = ContextCompat.getDrawable(this, R.drawable.stroke_accent)
        }
    }


    companion object {
        @JvmStatic
        fun open(context: Context, title: String, body: Int, style: Boolean = false) {
            val intent = Intent(context, TitleWithDetailsActivity::class.java)
            intent.putExtra(TITLE, title)
            intent.putExtra(DETAILS, context.getString(body))
            intent.putExtra(STYLE, style)
            context.startActivity(intent)
        }

        @JvmStatic
        fun open(context: Context, title: String, body: Int) {
            val intent = Intent(context, TitleWithDetailsActivity::class.java)
            intent.putExtra(TITLE, title)
            intent.putExtra(DETAILS, context.getString(body))
            intent.putExtra(STYLE, false)
            context.startActivity(intent)
        }
    }
}
