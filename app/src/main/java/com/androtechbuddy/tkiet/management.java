package com.androtechbuddy.tkiet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class management<ActivityMainBinding> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_management);
        getSupportActionBar().setTitle("Management");

        ActivityMainBinding activityMainBinding = (ActivityMainBinding) DataBindingUtil
                .setContentView(this,R.layout.activity_management);

    }

    public void AICTE1992(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://tkietwarana.ac.in/upload/management/AICTE%20Approval%20Letter%201992.pdf"));
        startActivity(browserIntent);
    }
    public void AICTE_report2018(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://tkietwarana.ac.in/upload/management/LOA%20&%20EOA%20REPORT.pdf"));
        startActivity(browserIntent);
    }
    public void AICTE2018(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://tkietwarana.ac.in/upload/management/AICTE%20Approval%20Letter%202018.pdf"));
        startActivity(browserIntent);
    }
    public void AICTE2019(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://tkietwarana.ac.in/upload/management/AICTE%20Docs/6268_EOA_AICTE_201920.pdf"));
        startActivity(browserIntent);
    }
    public void AICTE2020(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://tkietwarana.ac.in/upload/management/EOA_Report_2020-21.pdf"));
        startActivity(browserIntent);
    }
}