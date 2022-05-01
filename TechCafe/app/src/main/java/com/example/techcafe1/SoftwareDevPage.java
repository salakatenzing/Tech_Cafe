package com.example.techcafe1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SoftwareDevPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_software_dev_page);


        View button1 = findViewById(R.id.sd_topic_block_1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_SD_Skill_1();
            }
        });
        View button2 = findViewById(R.id.sd_topic_block_2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_SD_Skill_2();
            }
        });
        View button3 = findViewById(R.id.sd_topic_block_3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_SD_Skill_3();
            }
        });
        View button4 = findViewById(R.id.sd_topic_block_4);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_SD_Skill_4();
            }
        });
        View button5 = findViewById(R.id.sd_topic_block_5);
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_SD_Skill_5();
            }
        });

        View button20 = findViewById(R.id.sd_topic_20);
        button20.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {open_SD_Resource_1();}
        });

        View button21 = findViewById(R.id.sd_topic_21);
        button21.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {open_SD_Resource_2();}
        });
        View button22 = findViewById(R.id.sd_topic_22);
        button22.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {open_SD_Resource_3();}
        });
        View button23 = findViewById(R.id.sd_topic_23);
        button23.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {open_SD_Resource_4();}
        });


    }
    public void open_SD_Skill_1(){
        Intent intent = new Intent (this, SD_Skill_1.class);
        startActivity(intent);
    }
    public void open_SD_Skill_2(){
        Intent intent = new Intent (this, SD_Skill_2.class);
        startActivity(intent);
    }
    public void open_SD_Skill_3(){
        Intent intent = new Intent (this, SD_Skill_3.class);
        startActivity(intent);
    }
    public void open_SD_Skill_4(){
        Intent intent = new Intent (this, SD_Skill_4.class);
        startActivity(intent);
    }
    public void open_SD_Skill_5(){
        Intent intent = new Intent (this, SD_Skill_5.class);
        startActivity(intent);
    }
    public void open_SD_Resource_1(){
        Intent intent = new Intent (this, sd_resources_1.class);
        startActivity(intent);
    }
    public void open_SD_Resource_2(){
        Intent intent = new Intent (this, SD_Resource_2.class);
        startActivity(intent);
    }
    public void open_SD_Resource_3(){
        Intent intent = new Intent (this, SD_Resources_3.class);
        startActivity(intent);
    }
    public void open_SD_Resource_4(){
        Intent intent = new Intent (this, SD_Resources_4.class);
        startActivity(intent);
    }
}