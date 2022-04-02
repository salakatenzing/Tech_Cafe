package com.example.techcafe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;


public class home_page extends AppCompatActivity {

    private Button sd;
    private Button cs;
    private Button ur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        // Setting up each button to load their respective US20 activity
        sd = (Button) findViewById(R.id.sd);
        sd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loadUS20 = new Intent(home_page.this, sd_US20.class);
                home_page.this.startActivity(loadUS20);
            }


        });

        cs = (Button) findViewById(R.id.cs);
        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loadUS20 = new Intent(home_page.this, cs_US20.class);
                home_page.this.startActivity(loadUS20);
            }


        });

        ur = (Button) findViewById(R.id.ur);
        ur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent loadUS20 = new Intent(home_page.this, ur_US20.class);
                home_page.this.startActivity(loadUS20);
            }


        });


    }
}