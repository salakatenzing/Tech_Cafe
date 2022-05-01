package com.example.techcafe1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class UIX_Skill_3 extends YouTubeBaseActivity {
    Button Fe3Video;
    YouTubePlayerView javaPlayerview;
    YouTubePlayer.OnInitializedListener onInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uix_skill3);

        Fe3Video = (Button) findViewById(R.id.FE_skill3_play);
        javaPlayerview = (YouTubePlayerView) findViewById(R.id.FE_3_vid);

        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("1K64fWX5z4U");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
        Fe3Video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                javaPlayerview.initialize("AIzaSyCCEvFjfz4GFYUOpTaLl-gHbpHAtzSxgHg", onInitializedListener);
            }
        });
    }
}