package com.androtechbuddy.tkiet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import static com.androtechbuddy.tkiet.MainActivity.openCustomTabs;

public class computer_useful_links extends AppCompatActivity {
    LinearLayout github_view, StackOverFlow_view, StackExchange_view, W3Schools_view, GreeksForGreeks_view;
    String [] urls = new String[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computer__useful__links);
        getSupportActionBar().setTitle("Computer Branch");

        //URl's
        urls[0] = "https://github.com/";
        urls[1] = "https://stackoverflow.com/";
        urls[2] = "https://stackexchange.com/";
        urls[3] = "https://www.w3schools.com/";
        urls[4] = "https://www.geeksforgeeks.org/";

        //FindView
        github_view = findViewById(R.id.github_view);
        StackOverFlow_view = findViewById(R.id.stackoverflow_view);
        StackExchange_view = findViewById(R.id.StackExchnage_view);
        W3Schools_view = findViewById(R.id.w3schools_view);
        GreeksForGreeks_view = findViewById(R.id.greeksforgreeks_view);

        //GitHub
        github_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(computer_useful_links.this,builder.build(), Uri.parse(urls[0]));
            }
        });

        //StackOverFlow
        StackOverFlow_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(computer_useful_links.this,builder.build(), Uri.parse(urls[1]));
            }
        });

        //StackExchange
        StackExchange_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(computer_useful_links.this,builder.build(), Uri.parse(urls[2]));
            }
        });

        //W3Schools
        W3Schools_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(computer_useful_links.this,builder.build(), Uri.parse(urls[3]));
            }
        });

        //Greeks For Greeks
        GreeksForGreeks_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(computer_useful_links.this,builder.build(), Uri.parse(urls[4]));
            }
        });

    }
}