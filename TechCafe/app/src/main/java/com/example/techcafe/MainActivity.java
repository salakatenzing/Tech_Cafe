package com.example.techcafe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {
//    private Button guestButton;
    private FirebaseAuth mAuth;
    //Declaring functional buttons 'onCreate', so they work and contain data, when the app launches.
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //_________FIREBASE________
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");
        mAuth = FirebaseAuth.getInstance();

        //__________NOT FIREBASE_____________
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // LogIn Button setup
        Button button_login = (Button) findViewById(R.id.button_login);//button name is called, but XML ID is used.
        button_login.setOnClickListener(view -> openLogInPage());

        //SignUp Button setup
        Button button_signup = (Button) findViewById(R.id.button_signup);//button name is called, but XML ID is used.
        button_signup.setOnClickListener(view -> openSignUpPage());

        //Guest Button setup
        Button guest_login = (Button) findViewById(R.id.button_guest);
        guest_login.setOnClickListener(view -> openGuestPage());

    }
    //________________________________________________________________________________________________________
        //LogInPage open function, when the button is pressed.
        public void openLogInPage(){
            Intent intent = new Intent(this, login_page.class);//class is the JAVA file, that calls XML within.
            startActivity(intent);
        }

        //SignUpPage open function, when the button is pressed.
        public void openSignUpPage(){
            Intent intent = new Intent(this, signup_page.class);//class is the JAVA file, that calls XML within.
            startActivity(intent);
        }
        public void openGuestPage(){
            Intent intent = new Intent(this, home_page.class);
            startActivity(intent);
        }
}