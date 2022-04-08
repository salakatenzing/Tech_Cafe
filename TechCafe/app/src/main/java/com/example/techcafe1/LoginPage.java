package com.example.techcafe1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Objects;


public class LoginPage extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private static final String TAG = RegisterPage.class.getName();
    EditText emailUserEntry;
    EditText passwordUserEntry;
    Button button_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        mAuth = FirebaseAuth.getInstance();

        emailUserEntry = findViewById(R.id.editTextTextEmailAddress2);
        passwordUserEntry = findViewById(R.id.editTextTextPassword2);

        button_login = findViewById(R.id.register_button);//button name is called, but XML ID is used.
        button_login.setOnClickListener(view -> loginUser());
    }

    private void loginUser() {
        String existingUserEmail = emailUserEntry.getText().toString();
        String existingUserPassword = passwordUserEntry.getText().toString();

        //if conditions
        mAuth.signInWithEmailAndPassword(existingUserEmail, existingUserPassword)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "Signed In");
                            FirebaseUser user = mAuth.getCurrentUser();
                            updateUI(user);
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "signInWithEmail:failure", task.getException());
                            Toast.makeText(LoginPage.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                            updateUI(null);
                        }
                    }
                });
    }

    private void updateUI(FirebaseUser user) {
        if (user != null) {
            Toast.makeText(this, "Welcome back!", Toast.LENGTH_LONG).show();
            openHomePage();

        } else {
            Toast.makeText(this, "Could not sign in", Toast.LENGTH_LONG).show();
        }
    }

    private void openHomePage() {
        Intent intent = new Intent(this, HomePage.class);//class is the JAVA file, that calls XML within.
        startActivity(intent);
        Toast.makeText(LoginPage.this, "Welcome back!",
                Toast.LENGTH_SHORT).show();
    }
}