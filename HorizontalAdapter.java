package com.example.kadeem.horizontalscroll;

import android.content.Context;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static java.security.AccessController.getContext;

/**
 * Created by Kadeem on 29/09/2017.
 */

class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.ViewHolder> {

    private ArrayList<String> mDataset;


    public HorizontalAdapter(ArrayList<String> mDataset) {
        this.mDataset = mDataset;
    }

    @Override
    public HorizontalAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        final View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.horizontal_row, parent, false);

        ViewHolder vh = new ViewHolder(v);

        //Manage onClick
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(v.getContext(), "card clicked", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        return vh;
    }

    @Override
    public void onBindViewHolder(HorizontalAdapter.ViewHolder holder, int position) {

        holder.mTitle.setText(mDataset.get(position));
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView mTitle;

        public ViewHolder(View itemView) {

            super(itemView);
            mTitle = (TextView) itemView.findViewById(R.id.title);
        }
    }


}
