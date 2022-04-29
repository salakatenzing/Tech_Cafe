package com.example.techcafe1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class SD_Skill_4 extends AppCompatActivity {

    TextView sdlink4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sd_skill4);

        sdlink4 = findViewById(R.id.sd_algo_res);
        sdlink4.setMovementMethod(LinkMovementMethod.getInstance());
    }
}