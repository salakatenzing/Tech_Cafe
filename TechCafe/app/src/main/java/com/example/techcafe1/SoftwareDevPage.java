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
        View button6 = findViewById(R.id.sd_topic_block_6);
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_SD_Skill_6();
            }
        });
        View button7 = findViewById(R.id.sd_topic_block_7);
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_SD_Skill_7();
            }
        });
        View button8 = findViewById(R.id.sd_topic_block_8);
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_SD_Skill_8();
            }
        });
        View button9 = findViewById(R.id.sd_topic_block_9);
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_SD_Skill_9();
            }
        });
        View button10 = findViewById(R.id.sd_topic_block_10);
        button10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_SD_Skill_10();
            }
        });
        View button11 = findViewById(R.id.sd_topic_block_11);
        button11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_SD_Skill_11();
            }
        });
        View button12 = findViewById(R.id.sd_topic_block_12);
        button12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_SD_Skill_12();
            }
        });
        View button13 = findViewById(R.id.sd_topic_block_13);
        button13.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_SD_Skill_13();
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
    public void open_SD_Skill_6(){
        Intent intent = new Intent (this, SDTechnical.class);
        startActivity(intent);
    }
    public void open_SD_Skill_7(){
        Intent intent = new Intent (this, SDsql.class);
        startActivity(intent);
    }
    public void open_SD_Skill_8(){
        Intent intent = new Intent (this, SDExperince.class);
        startActivity(intent);
    }
    public void open_SD_Skill_9(){
        Intent intent = new Intent (this, SDCodingAssesment.class);
        startActivity(intent);
    }
    public void open_SD_Skill_10(){
        Intent intent = new Intent (this, SDJavapython.class);
        startActivity(intent);
    }
    public void open_SD_Skill_11(){
        Intent intent = new Intent (this, SDJavaTechnical.class);
        startActivity(intent);
    }
    public void open_SD_Skill_12(){
        Intent intent = new Intent (this, SDJavaScript.class);
        startActivity(intent);
    }
    public void open_SD_Skill_13(){
        Intent intent = new Intent (this, SDScreening.class);
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

}