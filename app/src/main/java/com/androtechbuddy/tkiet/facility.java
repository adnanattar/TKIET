package com.androtechbuddy.tkiet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class facility<ActivityMainBinding> extends AppCompatActivity {
TextView thombare,thombare_mail, patil, patil_mail, sunil_patil, methre, sangar, shevale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facility);
        getSupportActionBar().setTitle("Facilities");

        ActivityMainBinding activityMainBinding = (ActivityMainBinding) DataBindingUtil
                .setContentView(this,R.layout.activity_facility);

        thombare = findViewById(R.id.thombare_call_txt);
        thombare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9764997549"));
                startActivity(intent);
            }
        });

        thombare_mail = findViewById(R.id.thombare_mail_txt);
        thombare_mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:registrar@tkietwarana.ac.in"));
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Subject of Email Type Here...");
                intent.putExtra(Intent.EXTRA_TEXT, "Body of Email Type Hare...");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"registrar@tkietwarana.ac.in"});
                startActivity(intent.createChooser(intent,"Choose Mail App To Send Email"));
            }
        });

                patil = findViewById(R.id.patil_call_txt);
                patil.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:9421106538"));
                        startActivity(intent);
                    }
                });

                patil_mail = findViewById(R.id.patil_mail_txt);
                patil_mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:vibhavari.patil@tkietwarana.ac.in"));
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Subject of Email Type Here...");
                intent.putExtra(Intent.EXTRA_TEXT, "Body of Email Type Hare...");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"vibhavari.patil@tkietwarana.ac.in"});
                startActivity(intent.createChooser(intent,"Choose Mail App To Send Email"));
            }
        });


                sunil_patil = findViewById(R.id.office_contact_txt);
                sunil_patil.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:9226837300"));
                        startActivity(intent);
                    }
                });

                methre = findViewById(R.id.girls_contact_txt);
                methre.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:9922580284"));
                        startActivity(intent);
                    }
                });

                sangar = findViewById(R.id.boys_contact_txt);
                sangar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:8308112382"));
                        startActivity(intent);
                    }
                });

                shevale = findViewById(R.id.security_contact_txt);
                shevale.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:9970130991"));
                        startActivity(intent);
                    }
                });
            }}
