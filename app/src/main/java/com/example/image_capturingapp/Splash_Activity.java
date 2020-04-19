package com.example.image_capturingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash_Activity extends AppCompatActivity {
      private static int Splash_Screen=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent (getApplicationContext(),MainActivity.class);
                startActivity(i);
                finish();

            }
        },Splash_Screen);

    }

}
