package com.example.android.soundcloud;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Breeze extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        //create an AِrrayList of words
        ArrayList<Song> songs = new ArrayList<Song>();
        //initialize array with songs
        songs.add(new Song("Natty Reeves", "Canoe"));
        songs.add(new Song("Distant.IO", "sunny days"));
        songs.add(new Song("ASO", "MY"));
        songs.add(new Song("dotPhase", "unexpainable"));
        songs.add(new Song("ASO", "Timeless"));
        songs.add(new Song("Conor Albert", "Morning Jam"));
        songs.add(new Song("Toshiki Hayashi", "seasons change"));
        songs.add(new Song("Letsuo", "wust be Oone"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}
