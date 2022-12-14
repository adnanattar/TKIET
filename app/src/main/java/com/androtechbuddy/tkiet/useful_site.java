package com.androtechbuddy.tkiet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.ads.AdView;

import static com.androtechbuddy.tkiet.MainActivity.openCustomTabs;

public class useful_site extends AppCompatActivity {

    private AdView mAdView;
    ImageView college, scholership, photocopy, nptel, efunda, vlab, internshala, examveda, computer, chemical, electrical, mechanical_, civil;
    String [] urls = new String[8];
    TextView college_txt, scholership_txt, photocopy_txt, nptel_txt, efunda_txt, vlab_txt, internshala_txt, examveda_txt, computer_txt, chemical_txt, electrical_txt, mechanical_txt_, civil_txt;
    LinearLayout college_view, scholership_view, photocopy_view, nptel_view, efunda_view, vlab_view, internshala_view, examveda_view, computer_view, chemical_view, electrical_view, mechanical_view_, civil_view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_useful_site);
        getSupportActionBar().setTitle("Useful Sites");

        //URl's
        urls[0] = "http://tkietwarana.ac.in/home.aspx";
        urls[1] = "http://mahadbtmahait.gov.in/";
        urls[2] = "http://210.212.172.136:8088";
        urls[3] = "https://nptel.ac.in/";
        urls[4] = "https://www.efunda.com/home.cfm";
        urls[5] = "https://www.vlab.co.in/";
        urls[6] = "https://internshala.com/";
        urls[7] = "https://www.examveda.com/";

        //Img FindView
        college = findViewById(R.id.college_img);
        scholership = findViewById(R.id.scholership_dbt_img);
        photocopy = findViewById(R.id.photocopy_img);
        nptel = findViewById(R.id.npetl_img);
        efunda = findViewById(R.id.efunda_img);
        vlab = findViewById(R.id.vlab_img);
        internshala = findViewById(R.id.intershala_img);
        examveda = findViewById(R.id.examveda_img);
        computer = findViewById(R.id.computer_img);
        chemical = findViewById(R.id.chemical_img);
        electrical = findViewById(R.id.elecrical_img);
        mechanical_ = findViewById(R.id.mech_img);
        civil = findViewById(R.id.civil_img);

        //TextView FindView
        college_txt = findViewById(R.id.college_txt);
        scholership_txt = findViewById(R.id.scholership_dbt_txt);
        photocopy_txt = findViewById(R.id.photocopy_txt);
        nptel_txt = findViewById(R.id.nptel_txt);
        efunda_txt = findViewById(R.id.efunda_txt);
        vlab_txt = findViewById(R.id.vlab_txt);
        internshala_txt = findViewById(R.id.intershala_txt);
        examveda_txt = findViewById(R.id.examveda_txt);
        computer_txt = findViewById(R.id.computer_txt);
        chemical_txt = findViewById(R.id.chemical_txt);
        electrical_txt = findViewById(R.id.elecrical_txt);
        mechanical_txt_ = findViewById(R.id.mech_txt);
        civil_txt = findViewById(R.id.civil_txt);

        //View FindView
        college_view = findViewById(R.id.college_view);
        scholership_view = findViewById(R.id.scholership_dbt_view);
        photocopy_view = findViewById(R.id.photocopy_view);
        nptel_view = findViewById(R.id.nptel_view);
        efunda_view = findViewById(R.id.efunda_view);
        vlab_view = findViewById(R.id.vlab_view);
        internshala_view = findViewById(R.id.intershala_view);
        examveda_view = findViewById(R.id.examveda_view);
        computer_view = findViewById(R.id.computer_view);
        chemical_view = findViewById(R.id.chemical_view);
        electrical_view = findViewById(R.id.elecrical_view);
        mechanical_view_ = findViewById(R.id.mechanical_view);
        civil_view = findViewById(R.id.civil_view);

        //Action CollegeSite
        college.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(useful_site.this,builder.build(), Uri.parse(urls[0]));
            }
        });

        college_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(useful_site.this,builder.build(),Uri.parse(urls[0]));
            }
        });

        college_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(useful_site.this,builder.build(),Uri.parse(urls[0]));
            }
        });


        //Action Scholership
        scholership.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(useful_site.this,builder.build(), Uri.parse(urls[1]));
            }
        });

        scholership_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(useful_site.this,builder.build(),Uri.parse(urls[1]));
            }
        });

        scholership_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(useful_site.this,builder.build(),Uri.parse(urls[1]));
            }
        });

        //Action PhotoCopy
        photocopy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(useful_site.this,builder.build(), Uri.parse(urls[2]));
            }
        });

        photocopy_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(useful_site.this,builder.build(),Uri.parse(urls[2]));
            }
        });

        photocopy_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(useful_site.this,builder.build(),Uri.parse(urls[2]));
            }
        });

        //Action NPTEL
        nptel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(useful_site.this,builder.build(), Uri.parse(urls[3]));
            }
        });

        nptel_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(useful_site.this,builder.build(),Uri.parse(urls[3]));
            }
        });

        nptel_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(useful_site.this,builder.build(),Uri.parse(urls[3]));
            }
        });

        //Action Efunda
        efunda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(useful_site.this,builder.build(), Uri.parse(urls[4]));
            }
        });

        efunda_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(useful_site.this,builder.build(),Uri.parse(urls[4]));
            }
        });

        efunda_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(useful_site.this,builder.build(),Uri.parse(urls[4]));
            }
        });

        //Action VLAB
        vlab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(useful_site.this,builder.build(), Uri.parse(urls[5]));
            }
        });

        vlab_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(useful_site.this,builder.build(),Uri.parse(urls[5]));
            }
        });

        vlab_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(useful_site.this,builder.build(),Uri.parse(urls[5]));
            }
        });

        //Action InternShala
        internshala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(useful_site.this,builder.build(), Uri.parse(urls[6]));
            }
        });

        internshala_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(useful_site.this,builder.build(),Uri.parse(urls[6]));
            }
        });

        internshala_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(useful_site.this,builder.build(),Uri.parse(urls[6]));
            }
        });

        //Action ExamVeda
        examveda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(useful_site.this,builder.build(), Uri.parse(urls[7]));
            }
        });

        examveda_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(useful_site.this,builder.build(),Uri.parse(urls[7]));
            }
        });

        examveda_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(useful_site.this,builder.build(),Uri.parse(urls[7]));
            }
        });

        //Action Computer Branch
        computer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),computer_useful_links.class);
                startActivity(intent);
            }
        });

        computer_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),computer_useful_links.class);
                startActivity(intent);
            }
        });

        computer_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),computer_useful_links.class);
                startActivity(intent);
            }
        });

        //Action Chemical Branch
        chemical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),chemical_useful_links.class);
                startActivity(intent);
            }
        });

        chemical_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),chemical_useful_links.class);
                startActivity(intent);
            }
        });

        chemical_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),chemical_useful_links.class);
                startActivity(intent);
            }
        });

        //Action Electrical Branch
        electrical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),electrical_useful_links.class);
                startActivity(intent);
            }
        });

        electrical_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),electrical_useful_links.class);
                startActivity(intent);
            }
        });

        electrical_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),electrical_useful_links.class);
                startActivity(intent);
            }
        });

        //Action Mechanical Branch
//        mechanical_.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(),mechanical_useful_links.class);
//                startActivity(intent);
//            }
//        });

//        mechanical_txt_.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(),mechanical_useful_links.class);
//                startActivity(intent);
//            }
//        });
//
        mechanical_view_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),mechanical_useful_links.class);
                startActivity(intent);
            }
        });

        //Action Civil Branch
        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),civil_useful_links.class);
                startActivity(intent);
            }
        });

        civil_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),civil_useful_links.class);
                startActivity(intent);
            }
        });

        civil_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),civil_useful_links.class);
                startActivity(intent);
            }
        });

    }
}