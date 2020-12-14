package com.example.latihan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        // set toolbar ke dalam support action bar
        setSupportActionBar(toolbar);

        // enable home button untuk navigasi
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // mengeset title/nama aplikasi
        getSupportActionBar().setTitle("Politeknik Sukabumi");

        // mengeset subtitle
        getSupportActionBar().setSubtitle("Teknik Komputer");

        // set logo toolbar
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);

        btn=findViewById(R.id.button2);
        btn.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i=new Intent(MainActivity.this,LatihanRecycler.class);
        startActivity(i);
    }
}