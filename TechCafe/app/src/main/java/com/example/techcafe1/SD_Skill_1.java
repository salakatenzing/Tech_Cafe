package com.example.techcafe1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class SD_Skill_1 extends YouTubeBaseActivity {
 Button javaVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sd_skill1);

        javaVideo = (Button) findViewById(R.id.sd_lang_1);
        javaVideo.setOnClickListener(view -> {
            Intent intent = new Intent(this, javaMapVideo.class);
            startActivity(intent);
            Toast.makeText(SD_Skill_1.this, "Beginning of journey!",
                    Toast.LENGTH_SHORT).show();
        });
    }
}