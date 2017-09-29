package com.example.kadeem.horizontalscroll;

import android.support.constraint.solver.ArrayLinkedVariables;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;


    private ArrayList<String> mDataset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mDataset = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            mDataset.add("Data Item" + i);
        }

        mRecyclerView = (RecyclerView) findViewById(R.id.HorizontalRecyclerView);

        //Helps with performance by limiting the size of the list before hand
        //once the size of the list is known.
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);


        //Set LayoutManager
        mRecyclerView.setLayoutManager(mLayoutManager);

        //Instantiate Adapter
        mAdapter = new HorizontalAdapter(mDataset);

        //Set RecyclerView Adapter
        mRecyclerView.setAdapter(mAdapter);


    }
}
