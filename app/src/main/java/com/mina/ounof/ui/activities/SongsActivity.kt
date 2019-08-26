package com.mina.ounof.ui.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.mina.ounof.R
import com.mina.ounof.ui.activities.base.BackActivity
import com.mina.ounof.ui.fragments.ProgramFragment

class SongsActivity : BackActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_songs)

        supportFragmentManager.beginTransaction()
            .replace(
                R.id.fragment_container,
                ProgramFragment.newInstance(intent.getIntExtra(RES_ID, R.array.songs_list))
            )
            .commit()
    }

    override fun getTitleRes(): String = getString(intent.getIntExtra(TITLE_ID, R.string.songs))

    companion object {

        @JvmStatic
        val RES_ID = "resID"
        val TITLE_ID = "titleID"

        fun open(context: Context, titleRes: Int, arrayRes: Int) {
            val intent = Intent(context, SongsActivity::class.java)
            intent.putExtra(RES_ID, arrayRes)
            intent.putExtra(TITLE_ID, titleRes)
            context.startActivity(intent)
        }
    }
}
