package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for (int i = 0; i < groceryList.size(); i++ ) System.out.println(groceryList.get(i));
    }

    public void modifyGroceryItem(int pos, String newItem) {
        groceryList.set(pos, newItem);

    }

    public void removeGroceryItem(int pos) {
        String item = groceryList.get(pos);
        groceryList.remove(pos);
        System.out.println("Item " + item + " has been removed from the grocery list!");
    }
}
