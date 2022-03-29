package com.example.techcafe;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class signup_page extends AppCompatActivity implements View.OnClickListener{
    //PRIVATE VARIABLES TO STORE LOGIN PASSWORDS AND LATER SEND TO THE SERVER
    private EditText editTextUsername, editTextPassword, editTextEmail;
    private TextView existingUser, existingEmail;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        mAuth = FirebaseAuth.getInstance();
        existingEmail = (TextView) findViewById(R.id.getNewEmail);
        existingEmail.setOnClickListener(this);

        existingUser = (Button) findViewById(R.id.signup_button);
        existingUser.setOnClickListener(this);

        editTextEmail = (EditText) findViewById(R.id.getNewEmail);
        editTextUsername = (EditText) findViewById(R.id.getUsername);
        editTextPassword = (EditText) findViewById(R.id.getPassword);



    }
    // When 'Register' Button is Pressed, check if user exists.
    public void onClick(View view){
        switch(view.getId()){
            case R.id.getUsername:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.getNewEmail:
                registerUser();
                break;


        }
    }

    public void registerUser() {
        String email = editTextEmail.getText().toString().trim();
        String username = editTextUsername.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();


        //Edge cases: so the User cant proceed without entering all required data and checkbox.
        if (email.isEmpty()){
            editTextEmail.setError("email is required");
            editTextEmail.requestFocus();
            return;
        }
        if (username.isEmpty()){
            editTextUsername.setError("Username is required");
            editTextUsername.requestFocus();
            return;
        }
        if (password.isEmpty()){
            editTextPassword.setError("Password is required");
            editTextPassword.requestFocus();
            return;
        }
        if (password.length() < 8){
            editTextPassword.setError("Password has to be minimum 8 chars long");
            editTextPassword.requestFocus();
            return;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            editTextEmail.setError("Valid email is required");
            editTextPassword.requestFocus();
        }

        //Checkbox to be added as a condition


        mAuth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            user User = new user(username, email);

                            //Checking if User is now stored on the database.
                            FirebaseDatabase
                                    .getInstance()
                                    .getReference("Users")
                                    .child(FirebaseAuth.getInstance()
                                            .getCurrentUser().getUid());
                            if(task.isSuccessful()){
                                System.out.println("New User"); //Here should navigate to Home Page.
                            }else{
                                System.out.println("User Registration error");
                            }
                        }
                    }
                });

    }

}