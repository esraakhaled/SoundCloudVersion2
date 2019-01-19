package com.example.android.soundcloud;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Midnight extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        //create an AِrrayList of words
        ArrayList<Song> songs = new ArrayList<Song>();
        //initialize array with songs
        songs.add(new Song("alvin", "sleepless"));
        songs.add(new Song("blackguy randy", "night calls"));
        songs.add(new Song("anxious", "memories"));
        songs.add(new Song("s-ilo", "asleep"));
        songs.add(new Song("smitty mamba", "fleeting"));
        songs.add(new Song("wevv", "so tired of everything"));
        songs.add(new Song("xori", "dream in"));
        songs.add(new Song("sleepless study club", "night plan"));

        MidnightAdapter adapter = new MidnightAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}