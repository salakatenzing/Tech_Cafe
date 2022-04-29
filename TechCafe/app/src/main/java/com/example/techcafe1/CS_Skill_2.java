package com.example.techcafe1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class CS_Skill_2 extends AppCompatActivity {

    TextView cslink2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs_skill2);

        cslink2 = findViewById(R.id.cs_network_res);
        cslink2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}