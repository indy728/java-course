package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // write your code here

//        int[] myArray = getIntegers();
//        reverseArray(myArray);
//        System.out.println("Array reversed: " + Arrays.toString(myArray));
//        reverseArray(myArray);
//        System.out.println("Array back to normal: " + Arrays.toString(myArray));
//
//        int minValue = findMin(myArray);
//        sortIntegers(myArray);
//        printArray(myArray);
//
//        System.out.println("The minimum value of the array is " + minValue);
//
//        GroceryList myGroceryList = new GroceryList();
//        myGroceryList.addGroceryItem("yogurt");
//        myGroceryList.addGroceryItem("tomatoes");
//        myGroceryList.addGroceryItem("onion");
//        myGroceryList.addGroceryItem("jalapeño");
//        myGroceryList.addGroceryItem("cheese");
//        myGroceryList.printGroceryList();
//        myGroceryList.modifyGroceryItem(4, "long beans");
//        myGroceryList.printGroceryList();
//        myGroceryList.removeGroceryItem(1);
//        myGroceryList.printGroceryList();

//        MobilePhone iPhone69 = new MobilePhone();
//        iPhone69.usePhone();

        Playlist myPlaylist = new Playlist();
        myPlaylist.play();

        scanner.close();

    }

    public static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) min = arr[i] < min ? arr[i] : min;
        return min;
    }

    public static void reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        int tmp;

        while (i < j) {
            tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
    }

    public static int[] getIntegers() {
        System.out.println("Enter how many numbers you would like to find the minimum of: ");
        int count = scanner.nextInt();
        int[] newArray = new int[count];

        System.out.println("enter " + count + " numbers:");
        for (int i = 0; i < count; i++) {
            newArray[i] = scanner.nextInt();
        }
        return newArray;
    }

    public static void sortIntegers(int[] intArray) {
        int i = 0;
        int a;

        while (i < intArray.length - 1) {
            if (intArray[i] < intArray[i + 1]) {
                a = intArray[i];
                intArray[i] = intArray[i + 1];
                intArray[i + 1] = a;
                i = 0;
            } else {
                i++;
            }
        }

//        return intArray;
    }

    public static void printArray(int[] intArray) {
//        String str;
//
//        for (int i = 0; i < intArray.length; i++) {
//            str = "";
//            if (i == 0) str += "[ ";
//            if (i != intArray.length - 1) str += intArray[i] + ", ";
//            else str += intArray[i] + " ]\n";
//            System.out.print(str);
//        }
        System.out.println(Arrays.toString(intArray));
    }
}
