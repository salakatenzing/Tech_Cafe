package com.example.techcafe1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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

}