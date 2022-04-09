package com.example.techcafe1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.zip.Inflater;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);


        ImageButton open_profile_page = findViewById(R.id.profile_button);
        open_profile_page.setOnClickListener(view -> {
            Intent intent = new Intent(this, ProfilePage.class);//class is the JAVA file, that calls XML within.
            startActivity(intent);
        });


        ImageButton open_notifications_page = findViewById(R.id.notifications_button);
        open_notifications_page.setOnClickListener(view -> {
            Intent intent = new Intent(this, NotificationsPage.class);//class is the JAVA file, that calls XML within.
            startActivity(intent);
        });

        View block1 = findViewById(R.id.block1);
        block1.setOnClickListener(view -> {
            Intent intent = new Intent(this, SoftwareDevPage.class);//class is the JAVA file, that calls XML within.
            startActivity(intent);
        });

        View block2 = findViewById(R.id.block2);
        block2.setOnClickListener(view -> {
            Intent intent = new Intent(this, CyberSecurityPage.class);//class is the JAVA file, that calls XML within.
            startActivity(intent);
        });

        View block3 = findViewById(R.id.block3);
        block3.setOnClickListener(view -> {
            Intent intent = new Intent(this, UI_UXPage.class);//class is the JAVA file, that calls XML within.
            startActivity(intent);
        });


    }
}