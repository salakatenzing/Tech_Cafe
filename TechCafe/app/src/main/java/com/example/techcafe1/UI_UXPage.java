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
        View button4 = findViewById(R.id.uix_topic_block_4);
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_UIX_Skill_4();
            }
        });
        View button5 = findViewById(R.id.uix_topic_block_5);
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_UIX_Skill_5();
            }
        });
        View button6 = findViewById(R.id.uix_topic_block_6);
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_UIX_Skill_6();
            }
        });
        View button7 = findViewById(R.id.uix_topic_block_7);
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_UIX_Skill_7();
            }
        });
        View button8 = findViewById(R.id.uix_topic_block_8);
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                open_UIX_Skill_8();
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
    public void open_UIX_Skill_4(){
        Intent intent = new Intent (this, UIX_Skill_4.class);
        startActivity(intent);
    }
    public void open_UIX_Skill_5(){
        Intent intent = new Intent (this, UIX_Skill_5.class);
        startActivity(intent);
    }
    public void open_UIX_Skill_6(){
        Intent intent = new Intent (this, UIUXBehavior.class);
        startActivity(intent);
    }
    public void open_UIX_Skill_7(){
        Intent intent = new Intent (this, UIXTechnical.class);
        startActivity(intent);
    }
    public void open_UIX_Skill_8(){
        Intent intent = new Intent (this, SDReact.class);
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
    public void open_UIX_Resource_5(){
        Intent intent = new Intent (this, UIX_Resource_5.class);
        startActivity(intent);
    }
}