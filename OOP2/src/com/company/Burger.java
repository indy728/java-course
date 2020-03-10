package com.company;

public class Burger {
    private String name;
    private String rollType;
    private int pattyCount;
    private Additions additions;
    private double total;
    private double basePrice = 2.95;
    private double pattyPrice = .50;

    public Burger(String name, String rollType, int pattyCount, Additions additions) {
        this.name = name;
        this.rollType = rollType;
        this.pattyCount = pattyCount;
        this.additions = additions;
        this.total = basePrice + pattyCount * pattyPrice + additions.getPriceTotal();
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double newTotal) {
        this.total = newTotal;
    }


    public void getReceiptTop() {
        String patties = pattyCount < 2 ? "patty" : "patties";

        System.out.println("Thank you for ordering with Bill's Burgers. Your order of " + name + " is as follows:");
        System.out.println("Burger on a " + rollType + ": $" + String.format("%.2f", basePrice));
        System.out.println("+ " + (pattyCount == 0 ? "no " : pattyCount + " ") + patties + ": $" + String.format("%.2f", pattyPrice * pattyCount));
    }

    public void getAdditionsListPricing() {
        additions.getListPricing();
    }

    public void getReceiptTotal() {
        System.out.println("--------------------------------------");
        System.out.println("Total price: " + ": $" + String.format("%.2f", total));
    }

    public void printOut() {
        getReceiptTop();
        getAdditionsListPricing();
        getReceiptTotal();
    }

}
