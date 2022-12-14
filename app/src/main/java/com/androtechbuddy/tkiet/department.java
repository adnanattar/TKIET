package com.androtechbuddy.tkiet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

public class department<ActivityMainBinding> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department);
        getSupportActionBar().setTitle("Departments");

        ActivityMainBinding activityMainBinding = (ActivityMainBinding) DataBindingUtil
                .setContentView(this,R.layout.activity_department);

    }
}