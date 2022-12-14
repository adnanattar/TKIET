package com.androtechbuddy.tkiet;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.Activity;
import android.app.DownloadManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.webkit.DownloadListener;
import android.webkit.URLUtil;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class webActivity extends AppCompatActivity {
private WebView webView;
private String sURL,sFileName, sUserAgent;
    private Object URLUtil;

    public static void navigate(Activity activity, String url, boolean from_notif) {
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack();
        }else
        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webView = findViewById(R.id.webview);
        webView.setWebChromeClient(new WebChromeClient());
        webView.setWebViewClient(new WebViewClient());



        Intent intent = getIntent();
        String webSite = intent.getStringExtra("links");

        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(webSite);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //Download
        webView.setDownloadListener(new DownloadListener() {
            public void onDownloadStart(String url, String userAgent,
                                        String contentDisposition, String mimetype,
                                        long contentLength) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        //1. New Download Code But With Some Error
//        webView.setDownloadListener(new DownloadListener() {
//            @Override
//            public void onDownloadStart(String s, String s1, String s2, String s3, long l) {
//                DownloadManager.Request myRequest = new DownloadManager.Request(Uri.parse(s));
//                myRequest.allowScanningByMediaScanner();
//                myRequest.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
//
//                DownloadManager myManager = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
//                myManager.enqueue(myRequest);
//
//                Toast.makeText(webActivity.this, "Your file is Downloading please wait", Toast.LENGTH_SHORT).show();
//            }
//        });


    }
}