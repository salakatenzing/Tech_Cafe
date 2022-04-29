package com.example.techcafe1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class CS_Skill_3 extends AppCompatActivity {

    TextView cslink3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs_skill3);

        cslink3 = findViewById(R.id.cs_system_res);
        cslink3.setMovementMethod(LinkMovementMethod.getInstance());


    }
}