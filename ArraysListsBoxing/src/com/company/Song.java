package com.company;

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = Math.max(duration, 0);
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }
}
