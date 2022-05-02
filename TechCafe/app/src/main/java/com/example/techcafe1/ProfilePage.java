package com.example.techcafe1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import org.w3c.dom.Text;

import java.util.Objects;


public class ProfilePage extends AppCompatActivity {
    private static final String TAG = "ProfilePage";
    FirebaseAuth mAuth;
    FirebaseUser current_user;
    public String retrieve_username;
    public String retrieve_email;
    public String retrieve_stats_sd;
    public String retrieve_stats_cyber;
    public String retrieve_stats_uiux;
    public Integer sd_percent, cyber_percent, uiux_percent;



    private DocumentReference DocRef, SD_ProgressDocRef,Cyber_ProgressRef,UIUX_ProgressRef;

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);
        //required forSignOut
        mAuth= FirebaseAuth.getInstance();
        current_user = mAuth.getCurrentUser();
        String user_email = current_user.getEmail();
        DocRef = db.collection("users").document(user_email);
        SD_ProgressDocRef = db.collection("users").document(user_email).collection("user_progress").document("Progress SD");
        Cyber_ProgressRef = db.collection("users").document(user_email).collection("user_progress").document("Progress CyberSecurity");
        UIUX_ProgressRef = db.collection("users").document(user_email).collection("user_progress").document("Progress UI-UX");

        getUsername();
        getProgressSD();
        getProgressCyber();
        getProgressUIUX();





        Button user_logout_button = (Button) findViewById(R.id.button_signout);//button name is called, but XML ID is used.
        user_logout_button.setOnClickListener(view -> {
            mAuth.signOut();
            Intent intent = new Intent(this, MainActivity.class);//class is the JAVA file, that calls XML within.
            startActivity(intent);
            Toast.makeText(ProfilePage.this, "Logged out successfully.",
                    Toast.LENGTH_SHORT).show();
        });

        Button backButton = (Button) findViewById(R.id.prof_backButton_id);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               openHomeScreen();
            }
        });


    }


    //_________________________Get Data()_______________________________
    private void getUsername() {
        DocRef.get().addOnCompleteListener(task -> {
            if (task.isSuccessful()) {
                DocumentSnapshot document = task.getResult();
                if (document.exists()) {
                    Log.d(TAG, "DocumentSnapshot data: " + document.getData().get("name"));
                    retrieve_username = Objects.requireNonNull(document.getData().get("name")).toString();
                    retrieve_email = Objects.requireNonNull(document.getData().get("email")).toString();
                    TextView username = (TextView)findViewById(R.id.firebase_username);
                    username.setText(retrieve_username);

                } else {
                    Log.d(TAG, "Not received Username");
                }
            } else {
                Log.d(TAG, "get failed with Username GET()", task.getException());
            }
        });

    }

    //----------------------GET PROGRESS STATS()-----------------------------
    private void getProgressSD() {
        SD_ProgressDocRef.get().addOnCompleteListener(task -> {
            if (task.isSuccessful()) {
                DocumentSnapshot document = task.getResult();
                if (document.exists()) {
                    Log.d(TAG, "DocumentSnapshot data: " + document.getData().get("SD-ProgressBar"));
                    retrieve_stats_sd = Objects.requireNonNull(document.getData().get("SD-ProgressBar")).toString();
                    retrieve_stats_sd = retrieve_stats_sd + "%";
                    TextView sd_progress_stats = (TextView)findViewById(R.id.progress_sd_percent);
                    sd_progress_stats.setText(retrieve_stats_sd);
                    ProgressBar sd_bar = findViewById(R.id.progressBarSD);
                    String temp = Objects.requireNonNull(document.getData().get("SD-ProgressBar")).toString();
                    sd_percent = Integer.parseInt(temp);
                    //convert into percent!
                    sd_bar.setProgress(sd_percent);

                    //int sd_percent_get = (Integer) Objects.requireNonNull(document.getData().get("SD-ProgressBar"));
                    //ProgressBar sd_bar = findViewById(R.id.progressBarSD);
                    //sd_bar.setProgress(sd_percent_get);





                } else {
                    Log.d(TAG, "Not received Username");
                }
            } else {
                Log.d(TAG, "get failed with Username GET()", task.getException());
            }
        });
    }
    private void getProgressCyber() {
        Cyber_ProgressRef.get().addOnCompleteListener(task -> {
            if (task.isSuccessful()) {
                DocumentSnapshot document = task.getResult();
                if (document.exists()) {
                    Log.d(TAG, "DocumentSnapshot data: " + document.getData().get("Cyber-ProgressBar"));
                    retrieve_stats_cyber = Objects.requireNonNull(document.getData().get("Cyber-ProgressBar")).toString();
                    retrieve_stats_cyber = retrieve_stats_cyber + "%";
                    TextView cyber_progress_stats = (TextView)findViewById(R.id.progress_cyber_percent);
                    cyber_progress_stats.setText(retrieve_stats_cyber);
                    ProgressBar cyber_bar = findViewById(R.id.progressBarCyber);
                    String temp = Objects.requireNonNull(document.getData().get("Cyber-ProgressBar")).toString();
                    cyber_percent = Integer.parseInt(temp);
                    //convert into percent!
                    cyber_bar.setProgress(cyber_percent);

                } else {
                    Log.d(TAG, "Not received Username");
                }
            } else {
                Log.d(TAG, "get failed with Username GET()", task.getException());
            }
        });
    }
    private void getProgressUIUX() {
        UIUX_ProgressRef.get().addOnCompleteListener(task -> {
            if (task.isSuccessful()) {
                DocumentSnapshot document = task.getResult();
                if (document.exists()) {
                    Log.d(TAG, "DocumentSnapshot data: " + document.getData().get("UIUX-ProgressBar"));
                    retrieve_stats_uiux = Objects.requireNonNull(document.getData().get("UIUX-ProgressBar")).toString();
                    retrieve_stats_uiux = retrieve_stats_uiux + "%";
                    TextView uiux_progress_stats = (TextView)findViewById(R.id.progress_uiux_percent);
                    uiux_progress_stats.setText(retrieve_stats_uiux);
                    ProgressBar uiux_bar = findViewById(R.id.progressBarUIUX);
                    String temp = Objects.requireNonNull(document.getData().get("UIUX-ProgressBar")).toString();
                    uiux_percent = Integer.parseInt(temp);
                    //convert into percent!
                    uiux_bar.setProgress(uiux_percent);

                } else {
                    Log.d(TAG, "Not received Username");
                }
            } else {
                Log.d(TAG, "get failed with Username GET()", task.getException());
            }
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

    public void openHomeScreen() {
        Intent intent = new Intent(this, HomePage.class);
        startActivity(intent);
    }
}