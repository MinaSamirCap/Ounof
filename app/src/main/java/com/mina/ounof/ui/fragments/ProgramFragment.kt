package com.mina.ounof.ui.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.mina.ounof.R
import com.mina.ounof.ui.adapters.ProgramAdapter
import com.yqritc.recyclerviewflexibledivider.HorizontalDividerItemDecoration
import kotlinx.android.synthetic.main.fragment_program.*


private val ARG_ARRAY_RES = "arrayRes"

class ProgramFragment : Fragment() {

    private var arrayRes: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            arrayRes = it.getInt(ARG_ARRAY_RES)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_program, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recycler_view.addItemDecoration(
            HorizontalDividerItemDecoration.Builder(activity!!)
                .color(R.color.link)
                .sizeResId(R.dimen.divider)
                .build()
        )
        recycler_view.layoutManager = LinearLayoutManager(activity)
        val adapter = ProgramAdapter(activity, resources.getStringArray(arrayRes!!))
        recycler_view.adapter = adapter
    }


    companion object {

        @JvmStatic
        fun newInstance(arrayRes: Int) =
            ProgramFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_ARRAY_RES, arrayRes)
                }
            }
    }
}
