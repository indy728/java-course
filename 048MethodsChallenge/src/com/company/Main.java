package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String john = "John";
        String jake = "Jake";
        String joe = "Joe";
        String jeff = "Jeff";
        int johnScore = 1500;
        int jakeScore = 900;
        int joeScore = 400;
        int jeffScore = 50;

        displayHighScorePosition(john, calculateHighScorePosition(johnScore));
        displayHighScorePosition(jake, calculateHighScorePosition(jakeScore));
        displayHighScorePosition(joe, calculateHighScorePosition(joeScore));
        displayHighScorePosition(jeff, calculateHighScorePosition(jeffScore));
    }

    public static void displayHighScorePosition(String playerName, int scorePosition) {
        System.out.println(
                playerName +
                " managed to get into position " +
                scorePosition +
                " on the high score table."
        );
    }

    public static int calculateHighScorePosition(int score) {
//        if (score > 1000) return 1;
//        else if (score > 500) return 2;
//        else if (score > 100) return 3;
//        return 4;
        int position = 4;
        if (score > 1000) position = 1;
        else if (score > 500) position = 2;
        else if (score > 100) position = 3;
        return position;
    }
}
