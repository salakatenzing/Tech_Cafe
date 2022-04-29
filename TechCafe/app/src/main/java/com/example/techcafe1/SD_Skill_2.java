package com.example.techcafe1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class SD_Skill_2 extends AppCompatActivity {

    TextView sdlink2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sd_skill2);

        sdlink2 = findViewById(R.id.sd_databse_res);
        sdlink2.setMovementMethod(LinkMovementMethod.getInstance());
    }
}