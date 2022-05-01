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
        View button28 = findViewById(R.id.uix_topic_28);
        button28.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_UIX_Resource_1();
            }
        });
        View button29 = findViewById(R.id.uix_topic_29);
        button29.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_UIX_Resource_2();
            }
        });
        View button30 = findViewById(R.id.uix_topic_30);
        button30.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_UIX_Resource_3();
            }
        });
        View button31 = findViewById(R.id.uix_topic_31);
        button31.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_UIX_Resource_4();
            }
        });
        View button32 = findViewById(R.id.uix_topic_32);
        button32.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_UIX_Resource_5();
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
    public void open_UIX_Resource_1(){
        Intent intent = new Intent (this, UIX_Resource_1.class);
        startActivity(intent);
    }
    public void open_UIX_Resource_2(){
        Intent intent = new Intent (this, UIX_Resource_2.class);
        startActivity(intent);
    }
    public void open_UIX_Resource_3(){
        Intent intent = new Intent (this, UIX_Rsource_3.class);
        startActivity(intent);
    }
    public void open_UIX_Resource_4(){
        Intent intent = new Intent (this, UIX_Resource_4.class);
        startActivity(intent);
    }
    public void open_UIX_Resource_5(){
        Intent intent = new Intent (this, UIX_Resource_5.class);
        startActivity(intent);
    }
}