package com.example.techcafe1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class CS_Skill_1 extends AppCompatActivity {

    TextView cslink1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs_skill1);

        cslink1 = findViewById(R.id.cs_lang_res);
        cslink1.setMovementMethod(LinkMovementMethod.getInstance());
    }
}