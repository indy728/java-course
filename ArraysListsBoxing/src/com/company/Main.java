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

        iPod myPlaylist = new iPod();

        Album mau5 = new Album("4x4=12");
        mau5.addSong("Some Chords", 7.24);
        mau5.addSong("Sofi Needs A Ladder", 6.43);
        mau5.addSong("A City in Florida", 5.40);
        mau5.addSong("Bad Selection", 5.32);
        mau5.addSong("Animal Rights", 6.15);
        mau5.addSong("I Said (Michael Woods Remix)", 7.06);
        mau5.addSong("Cthulu Sleeps", 10.34);
        mau5.addSong("Right This Second", 7.50);
        mau5.addSong("Raise Your Weapon", 8.22);
        mau5.addSong("One Trick Pony", 3.59);
        mau5.addSong("Everything Before", 6.36);

        Album metallica = new Album("Master of Puppets");
        metallica.addSong("Battery", 5.13);
        metallica.addSong("Master of Puppets", 8.35);
        metallica.addSong("The Thing That Should Not Be", 6.36);
        metallica.addSong("Welcome Home (Sanitarium)", 6.27);
        metallica.addSong("Disposable Heroes", 8.17);
        metallica.addSong("Leper Messiah", 5.40);
        metallica.addSong("Orion", 8.27);
        metallica.addSong("Damage, Inc.", 5.32);

        Album daftPunk = new Album("Discovery");
        daftPunk.addSong("One More Time", 5.20);
        daftPunk.addSong("Aerodynamic", 3.27);
        daftPunk.addSong("Digital Love", 4.58);
        daftPunk.addSong("Harder, Better, Faster, Stronger", 3.45);
        daftPunk.addSong("Crescendolls", 3.31);
        daftPunk.addSong("Nightvision", 1.44);
        daftPunk.addSong("Superheroes", 3.57);
        daftPunk.addSong("High Life", 3.22);
        daftPunk.addSong("Something About Us", 3.51);
        daftPunk.addSong("Voyager", 3.47);
        daftPunk.addSong("Veridis Quo", 5.44);
        daftPunk.addSong("Short Circuit", 3.26);
        daftPunk.addSong("Face To Face", 3.58);
        daftPunk.addSong("Too Long", 10.00);

        for (Album a : new Album[]{mau5, metallica, daftPunk}) {
            myPlaylist.addAlbum(a);
        }

        myPlaylist.powerOn();

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
