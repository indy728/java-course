package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Kyle", 500);
        System.out.println("New score is " + newScore);

        calculateScore(300);
        calculateScore();

        double height = calcFeetAndInchesToCentimeters(5, 10);
        double dick = calcFeetAndInchesToCentimeters(6.5);
        double neg = calcFeetAndInchesToCentimeters(4, 13);
        double neg1 = calcFeetAndInchesToCentimeters(-5, 11);
        double neg2 = calcFeetAndInchesToCentimeters(-6);
        double neg3 = calcFeetAndInchesToCentimeters(4, -7);

        System.out.println("Kyle is " + height + " centimeters tall and his wiener is " +
                dick + " centimeters long." );
        if (neg + neg1 + neg2 + neg3 == -4){
            System.out.println("validation works");
        } else {
            System.out.println("validation doesn't work");
        }

        System.out.println(getDurationString(-8, 10));
        System.out.println(getDurationString(50, 60));
        System.out.println(getDurationString(0, -5));
        System.out.println(getDurationString(-10));
        System.out.println(getDurationString(100 * 60, 50));
        System.out.println(getDurationString(20, 5));
        System.out.println(getDurationString(185));
        System.out.println(getDurationString(225, 15));
    }

    public static int calculateScore(String name, int score){
        System.out.println("Player " + name + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Player anonymous scored " + score + " points.");
        return score * 1000;
    }

    public static void calculateScore(){
        System.out.println("No player name, no score achieved");
    }

    public static double calcFeetAndInchesToCentimeters(int ft, double in){
        if (ft < 0 || in < 0 || in > 12){
            return -1;
        }
        return calcFeetAndInchesToCentimeters((double)(12 * ft) + in);
    }

    public static double calcFeetAndInchesToCentimeters(double in){
        if (in < 0) return -1;
        return 2.54 * in;
    }

    public static String getDurationString(int min, int sec){
        if (min < 0 || sec < 0 || sec > 59){
            return "Invalid value";
        }
        return getDurationString(min * 60 + sec);
    }

    public static String getDurationString(int sec){
        if (sec < 0){
            return "Invalid value";
        } else if (sec > 99 * 60 * 60){
            return ("2 digit hour overload");
        }

        int hours = sec / (60 * 60);
        int minutes = (sec - hours * 60 * 60) / 60;
        int seconds = sec % 60;

        String sHours = hours < 10 ? "0" + hours : "" + hours;
        String sMinutes = minutes < 10 ? "0" + minutes : "" + minutes;
        String sSeconds = seconds < 10 ? "0" + seconds : "" + seconds;

        return (sHours + "h " + sMinutes + "m " + sSeconds + "s");

    }
}
