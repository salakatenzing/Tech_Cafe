package com.example.techcafe1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class SD_Skill_3 extends AppCompatActivity {

    TextView sdlink3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sd_skill3);

        sdlink3 = findViewById(R.id.sd_datastruc_res);
        sdlink3.setMovementMethod(LinkMovementMethod.getInstance());
    }
}