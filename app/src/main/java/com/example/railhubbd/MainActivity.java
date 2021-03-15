package com.example.railhubbd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;



public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000;
    ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homintent = new Intent(MainActivity.this,Home.class);
                startActivity(homintent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }


}
