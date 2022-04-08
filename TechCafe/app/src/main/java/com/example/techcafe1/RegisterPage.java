package com.example.techcafe1;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegisterPage extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private static final String TAG = RegisterPage.class.getName();
    EditText emailUserEntry;
    EditText nameUserEntry;
    EditText passwordUserEntry;
    Button button_register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_page);

        emailUserEntry = (EditText) findViewById(R.id.editTextTextEmailAddress);
        nameUserEntry = (EditText) findViewById(R.id.editTextTextName);
        passwordUserEntry = (EditText) findViewById(R.id.editTextTextPassword);
        button_register = findViewById(R.id.register_button);

        mAuth = FirebaseAuth.getInstance();

        emailUserEntry.setOnClickListener(view -> {
            createAccount();
        });
        nameUserEntry.setOnClickListener((view -> {
            createAccount();
        }));

        button_register.setOnClickListener(view -> createAccount());
    }
    private void openHomePage() {
        Intent intent = new Intent(this, HomePage.class);//class is the JAVA file, that calls XML within.
        startActivity(intent);
    }


    public void createAccount() {
        String newUserEmail = emailUserEntry.getText().toString();
        String newUserPassword = passwordUserEntry.getText().toString();
        String newUsersName = nameUserEntry.getText().toString();

        //if(TextUtils.isEmpty(newUserEmail)){
            //Print error etc. Later
        //}


        //else{
            mAuth.createUserWithEmailAndPassword(newUserEmail, newUserPassword)
                    .addOnCompleteListener(this, task -> {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "createUserWithEmail:success");
                            FirebaseUser user = mAuth.getCurrentUser();
                            updateUI(user);
                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w(TAG, "createUserWithEmail:failure", task.getException());
                            Toast.makeText(RegisterPage.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();
                            updateUI(null);
                        }

                        // ...
                    });
        //}

    }

    private void updateUI(FirebaseUser user) {
        if (user != null) {
            Toast.makeText(this, "You Signed In successfully", Toast.LENGTH_LONG).show();
            openHomePage();

        } else {
            Toast.makeText(this, "Could not sign in", Toast.LENGTH_LONG).show();
        }
    }

}