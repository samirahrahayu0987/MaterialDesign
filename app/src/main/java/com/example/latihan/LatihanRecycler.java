package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.ArrayList;
public class LatihanRecycler extends AppCompatActivity {
    private RecyclerView rvView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Prodi> dataSet = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan_recycler);


        dataSet = new ArrayList<>();

        rvView = (RecyclerView) findViewById(R.id.rv_main);
        rvView.setHasFixedSize(true);

        dataSet.addAll(DataProdi.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvView.setLayoutManager(new LinearLayoutManager(this));
        AdapterData listAdapter= new AdapterData(dataSet);
        rvView.setAdapter(listAdapter);


    }
}