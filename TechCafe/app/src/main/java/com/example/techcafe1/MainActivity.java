package com.example.techcafe1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.splashscreen.SplashScreen;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class MainActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SplashScreen splashScreen = SplashScreen.installSplashScreen(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();


        //Create an account Button
        Button button_login = (Button) findViewById(R.id.button_login_account1);//button name is called, but XML ID is used.
        button_login.setOnClickListener(view -> openLoginPage());
        //Create an account Button
        Button button_signup = (Button) findViewById(R.id.button_create_account1);//button name is called, but XML ID is used.
        button_signup.setOnClickListener(view -> openRegisterPage());


    }

    private void openLoginPage() {
        Intent intent = new Intent(this, LoginPage.class);//class is the JAVA file, that calls XML within.
        startActivity(intent);
    }

    private void openRegisterPage() {
        Intent intent = new Intent(this, RegisterPage.class);//class is the JAVA file, that calls XML within.
        startActivity(intent);
    }
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        updateUI(currentUser);
    }

    public void updateUI(FirebaseUser currentUser) {

        if (currentUser != null) {
            Toast.makeText(this, "Welcome Back!", Toast.LENGTH_LONG).show();
            startActivity(new Intent(this, HomePage.class));

        }

    }

}