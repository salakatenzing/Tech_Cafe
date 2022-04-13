package com.example.techcafe1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SoftwareDevPage extends AppCompatActivity {

    private Button button2;
    private Button button3;
    private Button button4;
    private Button button8;
    private Button button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_software_dev_page);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_SD_Skill_1();
            }
        });
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_SD_Skill_2();
            }
        });
        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_SD_Skill_3();
            }
        });
        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_SD_Skill_4();
            }
        });
        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener(){
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