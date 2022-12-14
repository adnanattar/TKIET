package com.androtechbuddy.tkiet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import static com.androtechbuddy.tkiet.MainActivity.openCustomTabs;

public class civil_useful_links extends AppCompatActivity {
    LinearLayout basic_civil_eng_view, the_constructor_view, civilax_view, eng_civil_view, daily_civil_view, asce_news_view;
    String [] urls = new String[6];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_civil_useful_links);
        getSupportActionBar().setTitle("Civil Branch");

        //URl's
        urls[0] = "https://www.basiccivilengineering.com";
        urls[1] = "https://www.theconstructor.org";
        urls[2] = "https://www.civilax.com";
        urls[3] = "https://www.engineeringcivil.com";
        urls[4] = "https://www.dailycivil.com";
        urls[5] = "https://source.asce.org/";

        basic_civil_eng_view = findViewById(R.id.basic_civil_eng_view);
        the_constructor_view = findViewById(R.id.the_constructor_view);
        civilax_view = findViewById(R.id.civilax_view);
        eng_civil_view = findViewById(R.id.eng_civil_view);
        daily_civil_view = findViewById(R.id.daily_civil_view);
        asce_news_view = findViewById(R.id.asce_news_view);

        //Basic Civil Eng.
        basic_civil_eng_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(civil_useful_links.this,builder.build(), Uri.parse(urls[0]));
            }
        });

        //The Constructor
        the_constructor_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(civil_useful_links.this,builder.build(), Uri.parse(urls[1]));
            }
        });

        //Civilax
        civilax_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(civil_useful_links.this,builder.build(), Uri.parse(urls[2]));
            }
        });

        //Eng. Civil
        eng_civil_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(civil_useful_links.this,builder.build(), Uri.parse(urls[3]));
            }
        });

        //Daily Civil
        daily_civil_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(civil_useful_links.this,builder.build(), Uri.parse(urls[4]));
            }
        });

        //ASCE News
        asce_news_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(civil_useful_links.this,builder.build(), Uri.parse(urls[5]));
            }
        });
    }
}