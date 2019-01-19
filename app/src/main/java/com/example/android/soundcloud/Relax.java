package com.example.android.soundcloud;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Relax extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        //create an AِrrayList of words
        ArrayList<Song> songs = new ArrayList<Song>();
        //initialize array with songs
        songs.add(new Song("Gabrielle Aplin", "Mountains"));
        songs.add(new Song("JP Cooper", "Colour Me In Gold"));
        songs.add(new Song("Clinton Washington", "Black & Blue"));
        songs.add(new Song("Blonde on Bread", "Stand By"));
        songs.add(new Song("Eric Perez", "I Don't Know Why"));
        songs.add(new Song("Sophie the truth", "can't tell u nothin"));
        songs.add(new Song("Sophie the truth", "say my name"));
        songs.add(new Song("tanphai", "Good night & GoodBye-mree"));

        RelaxAdapter adapter = new RelaxAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
