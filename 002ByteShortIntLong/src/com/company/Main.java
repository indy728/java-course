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

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte minimum value = " + myMinByteValue);
        System.out.println("Byte maximum value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short minimum value = " + myMinShortValue);
        System.out.println("Short maximum value = " + myMaxShortValue);
        
        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long minimum value = " + myMinLongValue);
        System.out.println("Long maximum value = " + myMaxLongValue);

        long bigLongLiteralValue = 2147483648L;

        byte myNewByteValue = (byte)(myMinByteValue / 2);
        System.out.println("My new byte value = " + myNewByteValue);
        
        short myNewShortValue = (short)(myMinShortValue / 2);
        System.out.println("My new short value = " + myNewShortValue);
    }
}
