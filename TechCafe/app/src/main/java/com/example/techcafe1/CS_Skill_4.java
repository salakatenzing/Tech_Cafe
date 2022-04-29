package com.example.techcafe1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class CS_Skill_4 extends AppCompatActivity {

    TextView cslink4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs_skill4);

        cslink4 = findViewById(R.id.cs_security_res);
        cslink4.setMovementMethod(LinkMovementMethod.getInstance());
    }
}