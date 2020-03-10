package com.company;

public class Addition {
    private String name;
    private double price;

    public Addition(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void printItemReceipt() {
        System.out.println("+ " + name + ": $" + String.format("%.2f", price));
    }
}
