package com.mina.ounof.ui.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.mina.ounof.R;
import com.mina.ounof.ui.activities.SongsActivity;
import com.mina.ounof.ui.activities.TitleWithDetailsActivity;
import com.mina.ounof.ui.viewholders.ProgramViewHolder;


/**
 * Created by Mina on 1/27/2017.
 */

public class ProgramAdapter extends RecyclerView.Adapter<ProgramViewHolder> {

    private String[] tableNameList;
    private Context context;

    public ProgramAdapter(Context context, String[] itemList) {
        this.context = context;
        this.tableNameList = itemList;
    }

    @NonNull
    @Override
    public ProgramViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_program, parent, false);
        layoutView.setLayoutParams(new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        return new ProgramViewHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(final ProgramViewHolder holder, int position) {
        holder.textView.setText(tableNameList[position]);

        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleSongClick(holder.getAdapterPosition());
            }
        });

    }

    private void handleSongClick(int adapterPosition) {
        if (context instanceof SongsActivity) {
            switch (adapterPosition) {
                case 0:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra1);
                    break;
                case 1:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra2);
                    break;
                case 2:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra3);
                    break;
                case 3:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra4);
                    break;
                case 4:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra5);
                    break;
                case 5:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra6);
                    break;
                case 6:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra7);
                    break;
                case 7:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra8);
                    break;
                case 8:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra9);
                    break;
                case 9:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra10);
                    break;
                case 10:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra11);
                    break;
                case 11:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra12);
                    break;
                case 12:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra13);
                    break;
                case 13:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra14);
                    break;
                case 14:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra15);
                    break;
                case 15:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra16);
                    break;
                case 16:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra17);
                    break;
                case 17:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra18);
                    break;
                case 18:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra19);
                    break;
                case 19:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra20);
                    break;
                case 20:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra21);
                    break;
                case 21:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra22);
                    break;
                case 22:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra23);
                    break;
                case 23:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra24);
                    break;
                case 24:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra25);
                    break;
                case 25:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra26);
                    break;
                case 26:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra27);
                    break;
                case 27:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra28);
                    break;
                case 28:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra29);
                    break;
                case 29:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra30);
                    break;
                case 30:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra31);
                    break;
                case 31:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra32);
                    break;
                case 32:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra33);
                    break;
                case 33:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra34);
                    break;
                case 34:
                    TitleWithDetailsActivity.open(context, tableNameList[adapterPosition], R.string.tra35);
                    break;
            }
        }
    }

    @Override
    public int getItemCount() {
        return tableNameList.length;
    }


}
