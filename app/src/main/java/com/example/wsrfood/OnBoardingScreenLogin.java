package com.example.wsrfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OnBoardingScreenLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.on_boarding_screen_login);
    }

    public void openSignInActivity(View view) {
        Intent intent = new Intent(this, SignInScreen.class);
        startActivity(intent);
    }

    public void openSignUpActivity(View view) {
        Intent intent = new Intent(this, SignUpScreen.class);
        startActivity(intent);
    }
}