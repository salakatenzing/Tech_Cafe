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
        View interview1_button = findViewById(R.id.sd_interview_1);
        interview1_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_interview1();
            }
        });
        View interview2_button = findViewById(R.id.sd_interview_2);
        interview2_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_interview2();
            }
        });
        View interview3_button = findViewById(R.id.sd_interview_3);
        interview3_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_interview3();
            }
        });
        View interview4_button = findViewById(R.id.sd_interview_4);
        interview4_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_interview4();
            }
        });
        View interview5_button = findViewById(R.id.sd_interview_5);
        interview5_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_interview5();
            }
        });
        View interview6_button = findViewById(R.id.sd_interview_6);
        interview6_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_interview6();
            }
        });
        View interview7_button = findViewById(R.id.sd_interview_7);
        interview7_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_interview7();
            }
        });
        View interview8_button = findViewById(R.id.sd_interview_8);
        interview8_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_interview8();
            }
        });
        View interview9_button = findViewById(R.id.sd_interview_9);
        interview9_button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_interview9();
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
    public void open_interview1(){
        Intent intent = new Intent (this, SDCodingAssesment.class);
        startActivity(intent);
    }
    public void open_interview2(){
        Intent intent = new Intent (this, SDExperince.class);
        startActivity(intent);
    }
    public void open_interview3(){
        Intent intent = new Intent (this, SDJavaScript.class);
        startActivity(intent);
    }
    public void open_interview4(){
        Intent intent = new Intent (this, SDJavaTechnical.class);
        startActivity(intent);
    }
    public void open_interview5(){
        Intent intent = new Intent (this, SDJavapython.class);
        startActivity(intent);
    }
    public void open_interview6(){
        Intent intent = new Intent (this, SDReact.class);
        startActivity(intent);
    }
    public void open_interview7(){
        Intent intent = new Intent (this, SDScreening.class);
        startActivity(intent);
    }
    public void open_interview8(){
        Intent intent = new Intent (this, SDsql.class);
        startActivity(intent);
    }
    public void open_interview9(){
        Intent intent = new Intent (this, SDTechnical.class);
        startActivity(intent);
    }

}