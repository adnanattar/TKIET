package com.androtechbuddy.tkiet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import static com.androtechbuddy.tkiet.MainActivity.openCustomTabs;

public class electrical_useful_links extends AppCompatActivity {
    LinearLayout electric4u_view, ele_eng_portal_view, all_abt_circuit_view, electronics_weekly_view;
    String [] urls = new String[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electrical_useful_links);
        getSupportActionBar().setTitle("Electrical Branch");

        //URl's
        urls[0] = "https://www.electrical4u.com/";
        urls[1] = "https://electrical-engineering-portal.com/";
        urls[2] = "https://www.allaboutcircuits.com/";
        urls[3] = "https://www.electronicsweekly.com/";

        electric4u_view = findViewById(R.id.electric4u_view);
        ele_eng_portal_view = findViewById(R.id.ele_eng_portal_view);
        all_abt_circuit_view = findViewById(R.id.all_abt_circuit_view);
        electronics_weekly_view = findViewById(R.id.electronics_weekly_view);

        //Electical 4U
        electric4u_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(electrical_useful_links.this,builder.build(), Uri.parse(urls[0]));
            }
        });

        //Electrical Eng. Portal
        ele_eng_portal_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(electrical_useful_links.this,builder.build(), Uri.parse(urls[1]));
            }
        });

        //All About Circuit
        all_abt_circuit_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(electrical_useful_links.this,builder.build(), Uri.parse(urls[2]));
            }
        });

        //Electronics Weekly
        electronics_weekly_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(electrical_useful_links.this,builder.build(), Uri.parse(urls[3]));
            }
        });
    }
}