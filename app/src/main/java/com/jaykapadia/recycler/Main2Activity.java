package com.jaykapadia.recycler;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class Main2Activity extends AppCompatActivity {
    Toolbar toolbar;
    TabLayout tablayout;
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        toolbar = findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.pager);
        tablayout = findViewById(R.id.tab);


        tablayoutadapter obj = new tablayoutadapter(getSupportFragmentManager());
        viewPager.setAdapter(obj);
        tablayout.setupWithViewPager(viewPager);
    }

}

