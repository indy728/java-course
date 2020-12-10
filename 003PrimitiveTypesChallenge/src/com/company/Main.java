package com.company;

public class Main {

    public static void main(String[] args) {
        byte challengeByteVar = 69;
        short challengeShortVar = 169;
        int challengeIntVar = 696969;
        long challengeLongVar = 50000L+  10L * (challengeByteVar + challengeShortVar + challengeIntVar);

        System.out.println(challengeByteVar);
        System.out.println(challengeShortVar);
        System.out.println(challengeIntVar);
        System.out.println(challengeLongVar);

        short shortTotal = (short)(1000 + 10 *
                (challengeByteVar + challengeShortVar + challengeIntVar / 1000));
        System.out.println(shortTotal);
    }
}
