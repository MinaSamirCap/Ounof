package com.mina.ounof.ui.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mina.ounof.R
import com.mina.ounof.ui.activities.base.BackActivity
import kotlinx.android.synthetic.main.activity_conference.*

class ConferenceActivity : BackActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conference)

        setupClickListener()
    }

    private fun setupClickListener() {
        alone_image_view.setOnClickListener {
            TitleWithDetailsActivity.open(
                this,
                getString(R.string.alone),
                R.string.alone_details,
                true
            )
        }
        holy_book_image_view.setOnClickListener {
            TitleWithDetailsActivity.open(
                this,
                getString(R.string.holy_book),
                R.string.holy_book_details,
                true
            )
        }
        work_groups_image_view.setOnClickListener {
            TitleWithDetailsActivity.open(
                this,
                getString(R.string.work_groups),
                R.string.work_groups_details,
                true
            )
        }
        stations_image_view.setOnClickListener {
            TitleWithDetailsActivity.open(
                this,
                getString(R.string.stations),
                R.string.stations_details,
                true
            )
        }
        projects_image_view.setOnClickListener {
            TitleWithDetailsActivity.open(
                this,
                getString(R.string.projects),
                R.string.projects_details,
                true
            )
        }
    }

    override fun getTitleRes(): String = getString(R.string.conference)

    companion object {
        fun open(context: Context) {
            context.startActivity(Intent(context, ConferenceActivity::class.java))
        }
    }
}
