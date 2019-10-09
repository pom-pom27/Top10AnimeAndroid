package com.example.myrecycleview;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import java.util.ArrayList;

public class AnimeDetail extends AppCompatActivity {

    private ArrayList<Anime> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earthshaker);
        getSupportActionBar().setElevation(0);

        ImageView heroImg;

        list.addAll(DataAnime.getHeroData());
        final Anime anime = list.get(MainActivity.posisi);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(anime.getName());
        }
        heroImg = findViewById(R.id.animePhoto);
        heroImg.setImageResource(anime.getPhoto());

        TextView sinopsis = findViewById(R.id.sinopsis);
        sinopsis.setText(anime.getSinopsis());


        YouTubePlayerView youTubePlayerView = findViewById(R.id.youtubePlayerView);
        getLifecycle().addObserver(youTubePlayerView);

        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = anime.getVideoId();
                youTubePlayer.cueVideo(videoId, 0f);
            }
        });
    }

}
