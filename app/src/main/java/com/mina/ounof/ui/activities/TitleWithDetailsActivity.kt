package com.mina.ounof.ui.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.mina.ounof.R
import com.mina.ounof.ui.activities.base.BackActivity
import kotlinx.android.synthetic.main.activity_title_with_details.*

val TITLE = "title"
val DETAILS = "details"

class TitleWithDetailsActivity : BackActivity() {


    override fun getTitleRes(): String = intent.getStringExtra(TITLE)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_title_with_details)

        details_text_view.text = intent.getStringExtra(DETAILS)
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

    companion object {
        @JvmStatic
        fun open(context: Context, title: String, body: Int) {
            val intent = Intent(context, TitleWithDetailsActivity::class.java)
            intent.putExtra(TITLE, title)
            intent.putExtra(DETAILS, context.getString(body))
            context.startActivity(intent)
        }
    }
}
