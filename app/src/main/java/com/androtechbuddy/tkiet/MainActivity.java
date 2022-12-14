package com.androtechbuddy.tkiet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toolbar;
import android.widget.ViewFlipper;


import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private AdView mAdView;
    ViewFlipper slider;
    ImageView  moodle, about_tkiet, management, acedamic,departments, admission, facilities, about_developer,contact_us, college_site, result, hall_ticket,useful_sites;
    String [] urls = new String[6];
    TextView moodle_txt , about_tkiet_txt, management_txt , acedamic_txt , department_txt , admission_txt , facilities_txt , about_developer_txt, result_txt , hall_ticket_txt , college_site_txt , privacy_policy, terms_conditions, contact_us_txt, useful_sites_txt;
    LinearLayout moodle_view, about_view, management_view, acedamic_view, departments_view, admission_view, facilities_view, about_developer_view,contact_us_view, college_site_view, result_view, hall_ticket_view, useful_sites_view;
    Button signup,myaccount,testing;

    private FirebaseAuth mAuth;
    private FirebaseUser mCurrentUser;
    private Button Notice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Logout
        mAuth = FirebaseAuth.getInstance();
        mCurrentUser = mAuth.getCurrentUser();


//        Notice = findViewById(R.id.notice);

//        Notice.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                Intent intent = new Intent(getApplicationContext(), CollegeNotice.class);
////                startActivity(intent);
//            }
//        });

        signup = findViewById(R.id.login);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Register.class);
                startActivity(intent);
            }
        });

        myaccount = findViewById(R.id.myaccount);
        myaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),my_account.class);
                startActivity(intent);
            }
        });

        //Testing Button
//        testing = findViewById(R.id.testing);
//        testing.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);
//                startActivity(intent);
//            }
//        });

        //Ads
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);




    int imgarray [] ={ R.drawable.tkiet2, R.drawable.tkiet3, R.drawable.tkiet4, R.drawable.tkiet5, R.drawable.tkiet6};
        slider = (ViewFlipper) findViewById(R.id.slider);

        for(int i=0; i<imgarray.length; i++) {
            showimage(imgarray[i]);
        }

        moodle = findViewById(R.id.moodle_img);
        //college_site = findViewById(R.id.college_img);
        result = findViewById(R.id.result_img);
        hall_ticket = findViewById(R.id.hall_ticket_img);
        about_tkiet = findViewById(R.id.about_img);
        management = findViewById(R.id.management_img);
        acedamic = findViewById(R.id.acedamic_img);
        departments = findViewById(R.id.department_img);
        admission = findViewById(R.id.admission_img);
        facilities = findViewById(R.id.facilities_img);
        about_developer = findViewById(R.id.about_developer_img);
        contact_us = findViewById(R.id.contact_img);
        useful_sites = findViewById(R.id.usefulsite_img);

        //Txt FindView
        privacy_policy = findViewById(R.id.privacy_policy);
        terms_conditions = findViewById(R.id.terms_and_conditions);
        moodle_txt = findViewById(R.id.moodle_txt);
        result_txt = findViewById(R.id.result_txt);
        hall_ticket_txt = findViewById(R.id.hall_ticket_txt);
        about_tkiet_txt = findViewById(R.id.about_txt);
        management_txt = findViewById(R.id.management_txt);
        acedamic_txt = findViewById(R.id.acedamic_txt);
        department_txt = findViewById(R.id.department_txt);
        admission_txt = findViewById(R.id.admission_txt);
        facilities_txt = findViewById(R.id.facilities_txt);
        about_developer_txt = findViewById(R.id.about_developer_txt);
        contact_us_txt = findViewById(R.id.contact_txt);
        //college_site_txt = findViewById(R.id.college_txt);
        useful_sites_txt = findViewById(R.id.usefulsite_txt);


        //View Find

        moodle_view = findViewById(R.id.moodle_view);
        about_view = findViewById(R.id.about_view);
        management_view = findViewById(R.id.management_view);
        acedamic_view = findViewById(R.id.acedamic_view);
        departments_view = findViewById(R.id.department_view);
        admission_view = findViewById(R.id.admission_view);
        facilities_view = findViewById(R.id.facilities_view);
        about_developer_view = findViewById(R.id.about_developer_view);
        contact_us_view = findViewById(R.id.contact_view);
        //college_site_view = findViewById(R.id.college_view);
        result_view = findViewById(R.id.result_view);
        hall_ticket_view = findViewById(R.id.hall_ticket_view);
        useful_sites_view = findViewById(R.id.usefulsite_view);

        //URl's
        urls[0] = "http://43.241.25.78/moodle/";
        urls[1] = "http://14.139.121.222/studentresult/";
        urls[2] = "http://14.139.121.222/studentonlineoroffline/";

        //Privacy Policy AND Terms & Conditions
        urls[3] = "https://androtechbuddy.blogspot.com/p/privacy-policy-for-tkiet-app.html";
        urls[4] = "https://androtechbuddy.blogspot.com/p/terms-conditions-for-tkiet-app.html";
        //College Site
        urls[5] = "http://tkietwarana.ac.in/home.aspx";
        //Privacy Policy
        privacy_policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(MainActivity.this,builder.build(),Uri.parse(urls[3]));
            }
        });

        //Terms & Conditions
        terms_conditions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(MainActivity.this,builder.build(),Uri.parse(urls[4]));
            }
        });

        //Action Moodle
        moodle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(MainActivity.this,builder.build(),Uri.parse(urls[0]));
            }
        });

        moodle_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(MainActivity.this,builder.build(),Uri.parse(urls[0]));
            }
        });

        moodle_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(MainActivity.this,builder.build(),Uri.parse(urls[0]));
            }
        });

        //Action College Site
/*        college_site.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(MainActivity.this,builder.build(),Uri.parse(urls[5]));
            }
       });

        college_site_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(MainActivity.this,builder.build(),Uri.parse(urls[5]));
            }
        });

        college_site_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(MainActivity.this,builder.build(),Uri.parse(urls[5]));
            }
        });
*/

        //Action Useful Sites
        useful_sites.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),useful_site.class);
                startActivity(intent);
            }
        });

        useful_sites_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),useful_site.class);
                startActivity(intent);
            }
        });

        useful_sites_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),useful_site.class);
                startActivity(intent);
            }
        });


        //Action Result
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(MainActivity.this,builder.build(),Uri.parse(urls[1]));
            }
        });

//        result_txt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(),webActivity.class);
//                intent.putExtra("links", urls[1]);
//                startActivity(intent);
//            }
//        });

        result_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(MainActivity.this,builder.build(),Uri.parse(urls[1]));
            }
        });

        result_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(MainActivity.this,builder.build(),Uri.parse(urls[1]));
            }
        });

        //Action Hall Ticket
        hall_ticket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(MainActivity.this,builder.build(),Uri.parse(urls[2]));
            }
        });

        hall_ticket_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(MainActivity.this,builder.build(),Uri.parse(urls[2]));
            }
        });

        hall_ticket_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor("#ffab40"));
                openCustomTabs(MainActivity.this,builder.build(),Uri.parse(urls[2]));
            }
        });

        //Action About Tkiet
        about_tkiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),about_tkiet.class);
                startActivity(intent);
            }
        });

        about_tkiet_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),about_tkiet.class);
                startActivity(intent);
            }
        });

        about_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),about_tkiet.class);
                startActivity(intent);
            }
        });

        //Action Management
        management.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),management.class);
                startActivity(intent);
            }
        });

        management_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),management.class);
                startActivity(intent);
            }
        });

        management_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),management.class);
                startActivity(intent);
            }
        });

        //Action Acedamics
        acedamic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),acedamics.class);
                startActivity(intent);
            }
        });

        acedamic_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),acedamics.class);
                startActivity(intent);
            }
        });

        acedamic_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),acedamics.class);
                startActivity(intent);
            }
        });

        //Action Departments
        departments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),department.class);
                startActivity(intent);
            }
        });

        department_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),department.class);
                startActivity(intent);
            }
        });

        departments_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),department.class);
                startActivity(intent);
            }
        });

        //Action Admission
        admission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),admissions.class);
                startActivity(intent);
            }
        });

        admission_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),admissions.class);
                startActivity(intent);
            }
        });

        admission_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),admissions.class);
                startActivity(intent);
            }
        });

        //Action Facilities
        facilities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),facility.class);
                startActivity(intent);
            }
        });

        facilities_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),facility.class);
                startActivity(intent);
            }
        });

        facilities_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),facility.class);
                startActivity(intent);
            }
        });

        //Action About Developer
        about_developer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),about_developer.class);
                startActivity(intent);
            }
        });

        about_developer_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),about_developer.class);
                startActivity(intent);
            }
        });

        about_developer_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),about_developer.class);
                startActivity(intent);
            }
        });

        //Action Contact Us
        contact_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),contact_us.class);
                startActivity(intent);
            }
        });

        contact_us_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),contact_us.class);
                startActivity(intent);
            }
        });

        contact_us_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),contact_us.class);
                startActivity(intent);
            }
        });
   }

   
   //ToolBar
        private void initToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(null);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void setSupportActionBar(Toolbar toolbar) {
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search_setting, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_myccount:
                Intent i = new Intent(this,my_account.class);
                this.startActivity(i);
                return true;
            case R.id.action_logout:
                mAuth.signOut();
                sendUserToLogin();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

//        if (item.getItemId() == android.R.id.home) {
//            finish();
//        }  else
//        {
//            Intent intent = new Intent(getApplicationContext(),my_account.class);
//            startActivity(intent);
//        }
//        return super.onOptionsItemSelected(item);
    }
   
   
    //College Site Open in Browser
//    public void college_site_(View view){
//        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://tkietwarana.ac.in/home.aspx"));
//        startActivity(browserIntent);}
//    public  void college_site_txt (View view){
//        Intent browserIntent_txt = new Intent(Intent.ACTION_VIEW, Uri.parse("http://tkietwarana.ac.in/home.aspx"));
//        startActivity(browserIntent_txt);}


    //Logout user
    @Override
    protected void onStart() {
        super.onStart();
        if(mCurrentUser == null){
            sendUserToLogin();
        }
    }

    private void sendUserToLogin() {
        Intent loginIntent = new Intent(MainActivity.this, Login.class);
        loginIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        loginIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(loginIntent);
        finish();
    }

        //Image Slider Top
    public void showimage (int img)
    {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(img);

        slider.addView(imageView);
        slider.setFlipInterval(3000);
        slider.setAutoStart(true);

        slider.setInAnimation(this, android.R.anim.slide_in_left);
        slider.setOutAnimation(this, android.R.anim.slide_out_right);
    }

    //Custome Tab
    public static void openCustomTabs(Activity activity, CustomTabsIntent customTabsIntent, Uri uri){
        String PackageName = "com.android.chrome";
        if(PackageName != null){
            customTabsIntent.intent.setPackage(PackageName);
            customTabsIntent.launchUrl(activity,uri);
        }else{
            activity.startActivity(new Intent(Intent.ACTION_VIEW, uri));
        }
    }

//    public void open(View view){
//        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://43.241.25.78/moodle/login/index.php"));
//        startActivity(browserIntent);
//    }
}