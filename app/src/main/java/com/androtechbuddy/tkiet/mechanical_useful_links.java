package com.androtechbuddy.tkiet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import static com.androtechbuddy.tkiet.MainActivity.openCustomTabs;

public class mechanical_useful_links extends AppCompatActivity {
    LinearLayout grabcad_view, asme_view, instutables_view, imechanical_view, daily_civil_view;
    String [] urls = new String[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanical_useful_links);
        getSupportActionBar().setTitle("Mechanical Branch");

        //URl's
        urls[0] = "https://grabcad.com/";
        urls[1] = "https://www.asme.org/";
        urls[2] = "https://www.instructables.com/";
        urls[3] = "https://imechanica.org/";


        grabcad_view = findViewById(R.id.grabcad_view);
        asme_view = findViewById(R.id.asme_view);
        instutables_view = findViewById(R.id.instutables_view);
        imechanical_view = findViewById(R.id.imechanical_view);


        //Grabcad
        grabcad_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(mechanical_useful_links.this,builder.build(), Uri.parse(urls[0]));
            }
        });

        //ASME
        asme_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(mechanical_useful_links.this,builder.build(), Uri.parse(urls[1]));
            }
        });

        //Instutables
        instutables_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(mechanical_useful_links.this,builder.build(), Uri.parse(urls[2]));
            }
        });

        //Imechanical
        imechanical_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(mechanical_useful_links.this,builder.build(), Uri.parse(urls[3]));
            }
        });

    }
}