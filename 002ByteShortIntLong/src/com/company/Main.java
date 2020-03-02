package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("integer minimum value: " + myMinIntValue);
        System.out.println("integer maximum value: " + myMaxIntValue);
        System.out.println("busted maximum int value: " + (myMaxIntValue + 1));
        System.out.println("busted minimum int value: " + (myMinIntValue - 1));

        int myMaxIntTest = 2147483647;

    }
}
