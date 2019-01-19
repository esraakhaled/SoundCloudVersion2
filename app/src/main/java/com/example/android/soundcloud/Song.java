package com.example.android.soundcloud;

public class Song {
    /**
     * artist name for the song
     */
    private String mArtistName;

    /**
     * song name for the song
     */
    private String mSongName;

    /**
     * Create a new song object.
     *
     * @param artistName is the name of artist of song
     * @param songName   is the name of song
     */
    public Song(String artistName, String songName) {
        mArtistName = artistName;
        mSongName = songName;
    }

    /**
     * Get the Artist Name of the song.
     */
    public String getmArtistName() {
        return mArtistName;
    }

    /**
     * Get the Song Name of the song.
     */
    public String getmSongName() {
        return mSongName;
    }


}
