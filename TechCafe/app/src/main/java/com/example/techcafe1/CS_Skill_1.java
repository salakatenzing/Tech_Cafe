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

public class CS_Skill_1 extends YouTubeBaseActivity {

    TextView cslink1;
    Button cyber1Video;
    YouTubePlayerView javaPlayerview;
    YouTubePlayer.OnInitializedListener onInitializedListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs_skill1);

        cslink1 = findViewById(R.id.cs_lang_res);
        cslink1.setMovementMethod(LinkMovementMethod.getInstance());

        cyber1Video = (Button) findViewById(R.id.cyber_skill1_play);
        javaPlayerview = (YouTubePlayerView) findViewById(R.id.cyber_1_vid);

        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("mS7qWC3CbOU");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
        cyber1Video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                javaPlayerview.initialize("AIzaSyCCEvFjfz4GFYUOpTaLl-gHbpHAtzSxgHg", onInitializedListener);
            }
        });
    }
}