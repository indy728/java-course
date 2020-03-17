package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Album {
    private String albumTitle;
    private ArrayList<Song> songs = new ArrayList<>();

    public Album(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public void addSong(String name, double duration) {
        songs.add(new Song(name, duration));
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void listSongs() {
        for (int i = 0; i < songs.size(); i++) {
            System.out.println("\t" + (int)(i + 1) + ": " +
                    songs.get(i).getFormattedSong());
        }
    }

    public int getSongCount() {
        return songs.size();
    }

    public Song getSong(int selection) {
        return songs.get(selection);
    }

}
