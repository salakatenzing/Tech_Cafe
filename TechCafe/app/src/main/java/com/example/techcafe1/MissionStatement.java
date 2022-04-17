package com.example.techcafe1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MissionStatement extends AppCompatActivity {

    private ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission_statement);

        //setting onClickListener to the entire layout so anywhere that is clicked will follow the intent
        layout = (ConstraintLayout)findViewById(R.id.missionStatement);
        layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MissionStatement.this, MainActivity.class);

                startActivity(intent);
            }
        });

    }
}