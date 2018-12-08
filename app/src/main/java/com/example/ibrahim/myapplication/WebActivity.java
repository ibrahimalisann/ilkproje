package com.example.ibrahim.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        Intent intent = getIntent();
        String site_url = intent.getStringExtra("site_url");
        WebView webView = findViewById(R.id.mywebview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(site_url);
    }
}
