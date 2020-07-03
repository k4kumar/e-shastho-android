package com.example.manchitroinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View someView = findViewById(R.id.main_layout);

        // Find the root view
        View root = someView.getRootView();

        // Set the color
        root.setBackgroundColor(getResources().getColor(android.R.color.white));

        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            public void run(){
                Intent homeIntent = new Intent(MainActivity.this,WebviewActivity.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}