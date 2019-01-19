package com.example.android.soundcloud;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MidnightAdapter extends ArrayAdapter<Song> {
    public MidnightAdapter(Midnight midnightActivity, ArrayList<Song> songs) {
        super(midnightActivity, 0, songs);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link AndroidWord} object located at this position in the list
        Song currentSong = getItem(position);
        // Find the TextView in the list_item.xml layout with the ID artist_name_view
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.artist_name_view);
        // Get the  artist name from the current android Song object and
        // set this text on the  artist name TextView
        nameTextView.setText(currentSong.getmArtistName());
        // Find the TextView in the list_item.xml layout with the ID song_name_view
        TextView songTextView = (TextView) listItemView.findViewById(R.id.song_name_view);
        // Get the song name from the current Android song object and
        // set this text on the song name TextView
        songTextView.setText(currentSong.getmSongName());


        return listItemView;

    }
}
