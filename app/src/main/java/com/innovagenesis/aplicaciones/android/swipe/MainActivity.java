package com.innovagenesis.aplicaciones.android.swipe;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    DiasNoticia adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager)findViewById(R.id.paginas);
        adapter = new DiasNoticia(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }
}
