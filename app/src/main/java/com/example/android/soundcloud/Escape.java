package com.example.android.soundcloud;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Escape extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        //create an AِrrayList of words
        ArrayList<Song> songs = new ArrayList<Song>();
        //initialize array with songs
        songs.add(new Song("Alina Baraz", "Electric "));
        songs.add(new Song("Galimatias", "May Be"));
        songs.add(new Song("Galimatias", "Make You Feel"));
        songs.add(new Song("Alina Baraz", "Drift"));
        songs.add(new Song("Robin Schulz", "Sun Goes Down"));
        songs.add(new Song("Olu Bliss", "Dive in "));
        songs.add(new Song("Pomo", "Ain't Nothing"));
        songs.add(new Song("J Tropic", "Hold Me Close"));

        EscapeAdapter adapter = new EscapeAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
