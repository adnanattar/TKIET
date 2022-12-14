package com.androtechbuddy.tkiet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import static com.androtechbuddy.tkiet.MainActivity.openCustomTabs;

public class chemical_useful_links extends AppCompatActivity {
    LinearLayout aiche_view,chem_eng_site_view,learn_cheme_view;
    String [] urls = new String[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemical_useful_links);
        getSupportActionBar().setTitle("Chemical Branch");

        //URl's
        urls[0] = "https://www.aiche.org/";
        urls[1] = "https://chemicalengineeringsite.in/";
        urls[2] = "http://www.learncheme.com/";

        aiche_view = findViewById(R.id.aiche_view);
        chem_eng_site_view = findViewById(R.id.chem_eng_site_view);
        learn_cheme_view = findViewById(R.id.learn_cheme_view);

        //AICHE
        aiche_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(chemical_useful_links.this,builder.build(), Uri.parse(urls[0]));
            }
        });

        //Chem. Eng. Site
        chem_eng_site_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(chemical_useful_links.this,builder.build(), Uri.parse(urls[1]));
            }
        });

        //Learn ChemE
        learn_cheme_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(chemical_useful_links.this,builder.build(), Uri.parse(urls[2]));
            }
        });
    }
}