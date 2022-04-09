package com.example.techcafe1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ProfilePage extends AppCompatActivity {
    Button user_logout_button;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);
        //reuired forSignOut
        mAuth= FirebaseAuth.getInstance();
        //ToolBar is the Top Menu ActionBar


        Button user_logout_button = (Button) findViewById(R.id.button_signout);//button name is called, but XML ID is used.
        user_logout_button.setOnClickListener(view -> {
            mAuth.signOut();
            Intent intent = new Intent(this, MainActivity.class);//class is the JAVA file, that calls XML within.
            startActivity(intent);
            Toast.makeText(ProfilePage.this, "Logged out successfully.",
                    Toast.LENGTH_SHORT).show();
        });


    }
    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user = mAuth.getCurrentUser();
        if(user == null){
            Intent intent = new Intent(this, MainActivity.class);//class is the JAVA file, that calls XML within.
            startActivity(intent);
        }
    }
}