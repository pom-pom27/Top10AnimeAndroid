package com.example.myrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static int posisi = 0;
    private RecyclerView rcyView;
    private ArrayList<Anime> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Top 10 Anime");
            getSupportActionBar().setElevation(0);
        }
        rcyView = findViewById(R.id.rvHeroes);
        rcyView.setHasFixedSize(true);
        list.addAll(DataAnime.getHeroData());
        showCardView();
    }


    private void showCardView() {
        rcyView.setLayoutManager(new LinearLayoutManager(this));
        card_viewHeroAdapter card_viewHeroAdapter = new card_viewHeroAdapter(list);
        rcyView.setAdapter(card_viewHeroAdapter);
        card_viewHeroAdapter.setOnItemClickCallback(new card_viewHeroAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Anime data) {
                toDetail();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.about) {
            Intent aboutPage = new Intent(this, AboutApp.class);
            startActivity(aboutPage);
        }
        return super.onOptionsItemSelected(item);
    }




    private void toDetail() {
        Intent intent = new Intent(MainActivity.this, AnimeDetail.class);
        startActivity(intent);
    }
}
