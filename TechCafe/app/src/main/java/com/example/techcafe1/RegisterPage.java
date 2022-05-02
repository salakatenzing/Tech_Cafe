package com.example.techcafe1;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegisterPage extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private static final String TAG = RegisterPage.class.getName();
    EditText emailUserEntry;
    EditText nameUserEntry;
    EditText passwordUserEntry;
    Button button_register;
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    public static final String KEY_email = "email";
    public static final String KEY_name = "name";



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

                            Map<String, Object> user_data = new HashMap<>();
                            user_data.put(KEY_email, newUserEmail);
                            user_data.put(KEY_name, newUsersName);
                            db.collection("users").document(newUserEmail).set(user_data);



                            //creating a Firestore 'topics' database to track progress
                            //Software Developement topics {5,8,3}
                            Map<String, Object> user_progress_sd = new HashMap<>();
                            user_progress_sd.put("SD-ProgressBar", 0);
                            user_progress_sd.put("Progress-SD-1-1", false);
                            user_progress_sd.put("Progress-SD-1-2", false);
                            user_progress_sd.put("Progress-SD-1-3", false);
                            user_progress_sd.put("Progress-SD-1-4", false);
                            user_progress_sd.put("Progress-SD-1-5", false);
                            user_progress_sd.put("Progress-SD-2-1", false);
                            user_progress_sd.put("Progress-SD-2-2", false);
                            user_progress_sd.put("Progress-SD-2-3", false);
                            user_progress_sd.put("Progress-SD-2-4", false);
                            user_progress_sd.put("Progress-SD-2-5", false);
                            user_progress_sd.put("Progress-SD-2-6", false);
                            user_progress_sd.put("Progress-SD-2-7", false);
                            user_progress_sd.put("Progress-SD-2-8", false);
                            user_progress_sd.put("Progress-SD-3-1", false);
                            user_progress_sd.put("Progress-SD-3-2", false);
                            user_progress_sd.put("Progress-SD-3-3", false);
                            db.collection("users").document(newUserEmail).collection("user_progress").document("Progress SD").set(user_progress_sd);

                            //Cybersecurity Topics {4,3,3}
                            Map<String, Object> user_progress_cyber = new HashMap<>();
                            user_progress_cyber.put("Cyber-ProgressBar", 0);
                            user_progress_cyber.put("Progress-Cyber-1-1", false);
                            user_progress_cyber.put("Progress-Cyber-1-2", false);
                            user_progress_cyber.put("Progress-Cyber-1-3", false);
                            user_progress_cyber.put("Progress-Cyber-1-4", false);
                            user_progress_cyber.put("Progress-Cyber-2-1", false);
                            user_progress_cyber.put("Progress-Cyber-2-2", false);
                            user_progress_cyber.put("Progress-Cyber-2-3", false);
                            user_progress_cyber.put("Progress-Cyber-3-1", false);
                            user_progress_cyber.put("Progress-Cyber-3-2", false);
                            user_progress_cyber.put("Progress-Cyber-3-3", false);
                            db.collection("users").document(newUserEmail).collection("user_progress").document("Progress CyberSecurity").set(user_progress_cyber);

                            //UI/UX Topics {5,3,4}
                            Map<String, Object> user_progress_UIUX = new HashMap<>();
                            user_progress_UIUX.put("UIUX-ProgressBar", 0);
                            user_progress_UIUX.put("Progress-UIUX-1-1", false);
                            user_progress_UIUX.put("Progress-UIUX-1-2", false);
                            user_progress_UIUX.put("Progress-UIUX-1-3", false);
                            user_progress_UIUX.put("Progress-UIUX-1-4", false);
                            user_progress_UIUX.put("Progress-UIUX-1-5", false);
                            user_progress_UIUX.put("Progress-UIUX-2-1", false);
                            user_progress_UIUX.put("Progress-UIUX-2-2", false);
                            user_progress_UIUX.put("Progress-UIUX-2-3", false);
                            user_progress_UIUX.put("Progress-UIUX-3-1", false);
                            user_progress_UIUX.put("Progress-UIUX-3-2", false);
                            user_progress_UIUX.put("Progress-UIUX-3-3", false);
                            user_progress_UIUX.put("Progress-UIUX-3-4", false);
                            db.collection("users").document(newUserEmail).collection("user_progress").document("Progress UI-UX").set(user_progress_UIUX);





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