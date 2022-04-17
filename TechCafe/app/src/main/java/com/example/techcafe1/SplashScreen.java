package com.example.techcafe1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

@SuppressLint("CustomSplashScreen")
public class SplashScreen extends AppCompatActivity {

    private FirebaseAuth mAuth;
    Handler h = new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        mAuth = FirebaseAuth.getInstance();

//        getSupportActionBar().hide();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            h.postDelayed(() -> {
                Intent i = new Intent(SplashScreen.this, MissionStatement.class);
                startActivity(i);
                finish();
            },3000);
        }else{
            h.postDelayed(() -> {
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);
                finish();
            },3000);
        }}
    }
