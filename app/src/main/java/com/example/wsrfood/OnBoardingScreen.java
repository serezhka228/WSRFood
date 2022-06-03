package com.example.wsrfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OnBoardingScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.on_boarding_screen);
    }

    public void openLoginActivity(View view) {
        Intent intent = new Intent(this, OnBoardingScreenLogin.class);
        startActivity(intent);
    }
}