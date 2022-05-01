package com.example.techcafe1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class SD_Skill_2 extends YouTubeBaseActivity {

    TextView sdlink2;
    Button sd2Video;
    YouTubePlayerView javaPlayerview;
    YouTubePlayer.OnInitializedListener onInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sd_skill2);

        sdlink2 = findViewById(R.id.sd_databse_res);
        sdlink2.setMovementMethod(LinkMovementMethod.getInstance());

        sd2Video = (Button) findViewById(R.id.sd_skill2_play);
        javaPlayerview = (YouTubePlayerView) findViewById(R.id.SD_2_vid);

        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("8hly31xKli0");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
        sd2Video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                javaPlayerview.initialize("AIzaSyCCEvFjfz4GFYUOpTaLl-gHbpHAtzSxgHg", onInitializedListener);
            }
        });

    }
}