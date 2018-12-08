package com.example.ibrahim.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText site_url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        site_url = findViewById(R.id.site_url);
    }

    public void siteyi_ac(View view) {
        Intent intent = new Intent(MainActivity.this, WebActivity.class);
        intent.putExtra("site_url", site_url.getText().toString());
        startActivity(intent);
    }
}
