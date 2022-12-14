package com.androtechbuddy.tkiet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class about_developer<ActivityMainBinding> extends AppCompatActivity {
TextView more;
Button contact_me;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_developer);
        getSupportActionBar().setTitle("About Developer");

        ActivityMainBinding activityMainBinding = (ActivityMainBinding) DataBindingUtil
                .setContentView(this,R.layout.activity_about_developer);

        // display image
        Tools.displayImageOriginal(this, (ImageView) findViewById(R.id.image_1), R.drawable.logo);
        Tools.displayImageOriginal(this, (ImageView) findViewById(R.id.image_2), R.drawable.crowd_locator_1_);
        Tools.displayImageOriginal(this, (ImageView) findViewById(R.id.image_3), R.drawable.crowd_locator_admin_logo);
        Tools.displayImageOriginal(this, (ImageView) findViewById(R.id.image_4), R.drawable.cal);
        Tools.displayImageOriginal(this, (ImageView) findViewById(R.id.image_5), R.drawable.dosti_2);
        Tools.displayImageOriginal(this, (ImageView) findViewById(R.id.image_6), R.drawable.labour_job);

        contact_me =findViewById(R.id.contact_me);
        contact_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Select Gmail", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setData(Uri.parse("mailto:androtechbuddy@gmail.com"));
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT, "Subject of Email Type Here...");
                intent.putExtra(Intent.EXTRA_TEXT, "Body of Email Type Here...");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"androtechbuddy@gmail.com"});
                startActivity(intent.createChooser(intent,"Choose Mail App To Send Email"));
            }
        });

        more =findViewById(R.id.more);
        more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),projects.class);
                startActivity(intent);
            }
        });

    }
    private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search_setting, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        } else {
            Toast.makeText(getApplicationContext(), item.getTitle() + " Coming Soon...", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}