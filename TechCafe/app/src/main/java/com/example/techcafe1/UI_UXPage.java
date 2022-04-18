package com.example.techcafe1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UI_UXPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui_uxpage);

        View button1 = findViewById(R.id.uix_topic_block_1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_UIX_Skill_1();
            }
        });
        View button2 = findViewById(R.id.uix_topic_block_2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_UIX_Skill_2();
            }
        });
        View button3 = findViewById(R.id.uix_topic_block_3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_UIX_Skill_3();
            }
        });
        View interview1_button = findViewById(R.id.uiux_interview_1);
        interview1_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_uiux_interview1();
            }
        });
        View interview2_button = findViewById(R.id.uiux_interview_2);
        interview2_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_uiux_interview2();
            }
        });

    }
    public void open_UIX_Skill_1(){
        Intent intent = new Intent (this, UIX_Skill_1.class);
        startActivity(intent);
    }
    public void open_UIX_Skill_2(){
        Intent intent = new Intent (this, UIX_Skill_2.class);
        startActivity(intent);
    }
    public void open_UIX_Skill_3(){
        Intent intent = new Intent (this, UIX_Skill_3.class);
        startActivity(intent);
    }
    public void open_uiux_interview1(){
        Intent intent = new Intent (this, UIUXBehavior.class);
        startActivity(intent);
    }
    public void open_uiux_interview2(){
        Intent intent = new Intent (this, UIXTechnical.class);
        startActivity(intent);
    }
}