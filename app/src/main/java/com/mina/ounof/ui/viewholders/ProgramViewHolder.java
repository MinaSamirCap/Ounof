package com.mina.ounof.ui.viewholders;

import android.view.View;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;

import com.mina.ounof.R;

/**
 * Created by Mina on 1/27/2017.
 */

public class ProgramViewHolder extends RecyclerView.ViewHolder {

    public AppCompatTextView textView;


    public ProgramViewHolder(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.text_view);
    }

}