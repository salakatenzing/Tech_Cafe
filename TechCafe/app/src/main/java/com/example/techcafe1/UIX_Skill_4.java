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

public class UIX_Skill_4 extends YouTubeBaseActivity {
    TextView sdlink3;
    Button Fe4Video;
    YouTubePlayerView javaPlayerview;
    YouTubePlayer.OnInitializedListener onInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uix_skill4);
        sdlink3 = findViewById(R.id.sd_datastruc_res);
        sdlink3.setMovementMethod(LinkMovementMethod.getInstance());

        Fe4Video = (Button) findViewById(R.id.FE_skill4_play);
        javaPlayerview = (YouTubePlayerView) findViewById(R.id.FE_4_vid);

        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("RBSGKlAvoiM");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
        Fe4Video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                javaPlayerview.initialize("AIzaSyCCEvFjfz4GFYUOpTaLl-gHbpHAtzSxgHg", onInitializedListener);
            }
        });

    }
}