package com.mina.ounof.ui.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.widget.AppCompatTextView
import com.mina.ounof.R
import com.mina.ounof.ui.activities.base.BackActivity
import com.mina.ounof.ui.adapters.ViewPagerAdapter
import com.mina.ounof.ui.fragments.ProgramFragment
import kotlinx.android.synthetic.main.activity_program.*

class ProgramActivity : BackActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_program)

        setupViewPager()
        setupTabs()
    }

    private fun setupTabs() {
        tab_layout.setupWithViewPager(view_pager)
        tab_layout.getTabAt(0)?.customView = setUpSingleTab(R.string.one, R.string.date1)
        tab_layout.getTabAt(1)?.customView = setUpSingleTab(R.string.two, R.string.date2)
        tab_layout.getTabAt(2)?.customView = setUpSingleTab(R.string.three, R.string.date3)
        tab_layout.getTabAt(3)?.customView = setUpSingleTab(R.string.four, R.string.date4)

    }

    private fun setUpSingleTab(text1: Int, text2: Int): View {
        val tabOne = LayoutInflater.from(this).inflate(R.layout.item_tab, null)
        val textView1One = tabOne.findViewById<AppCompatTextView>(R.id.tab1)
        val textView1Two = tabOne.findViewById<AppCompatTextView>(R.id.tab2)
        textView1One.text = getString(text1)
        textView1Two.text = getString(text2)
        return tabOne
    }

    private fun setupViewPager() {
        val pagerAdapter = ViewPagerAdapter(supportFragmentManager)
        pagerAdapter.addFragment(ProgramFragment.newInstance(R.array.day1), "ONE")
        pagerAdapter.addFragment(ProgramFragment.newInstance(R.array.day2), "TWO")
        pagerAdapter.addFragment(ProgramFragment.newInstance(R.array.day3), "THREE")
        pagerAdapter.addFragment(ProgramFragment.newInstance(R.array.day4), "FOUR")
        view_pager.adapter = pagerAdapter
    }

    override fun getTitleRes(): String = getString(R.string.conference)

    companion object {
        fun open(context: Context) {
            context.startActivity(Intent(context, ProgramActivity::class.java))
        }
    }
}
