package com.androtechbuddy.tkiet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class admissions<ActivityMainBinding> extends AppCompatActivity {
TextView tele, mail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admissions);
        getSupportActionBar().setTitle("Admissions");

        ActivityMainBinding activityMainBinding = (ActivityMainBinding) DataBindingUtil
                .setContentView(this,R.layout.activity_admissions);

        tele = findViewById(R.id.enquiry_tele_all_txt);
        tele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:02328224012"));
                startActivity(intent);
            }
        });

        mail = findViewById(R.id.enquiry_mail_all_txt);
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:admission@tkietwarana.ac.in"));
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Subject of Email Type Here...");
                intent.putExtra(Intent.EXTRA_TEXT, "Body of Email Type Hare...");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"admission@tkietwarana.ac.in"});
//                try {
//
//                }
//                catch (Exception e){
//                    Toast.makeText(this, e.getMessage(),Toast.LENGTH_SHORT).show();
//                }
                startActivity(intent.createChooser(intent,"Choose Mail App To Send Email"));
            }
        });
    }
}