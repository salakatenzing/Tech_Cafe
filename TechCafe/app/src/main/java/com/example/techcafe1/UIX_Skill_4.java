package com.example.techcafe1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class UIX_Skill_4 extends AppCompatActivity {
    TextView sdlink3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uix_skill4);
        sdlink3 = findViewById(R.id.sd_datastruc_res);
        sdlink3.setMovementMethod(LinkMovementMethod.getInstance());

    }
}