package com.company;

public class Additions {
    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;
    private double priceTotal;

    public Additions() {
        this(null);
    }

    public Additions(Addition addition1) {
        this(addition1, null);
    }

    public Additions(Addition addition1, Addition addition2) {
        this(addition1, addition2, null);
    }

    public Additions(Addition addition1, Addition addition2, Addition addition3) {
        this(addition1, addition2, addition3, null);
    }

    public Additions(Addition addition1, Addition addition2, Addition addition3, Addition addition4) {
        this.addition1 = addition1;
        this.addition2 = addition2;
        this.addition3 = addition3;
        this.addition4 = addition4;
        double total = 0;
        if (addition1 != null) total += addition1.getPrice();
        if (addition2 != null) total += addition2.getPrice();
        if (addition3 != null) total += addition3.getPrice();
        if (addition4 != null) total += addition4.getPrice();
        this.priceTotal = total;
    }

    public void getListPricing() {
        if (addition1 != null) addition1.printItemReceipt();
        if (addition2 != null) addition2.printItemReceipt();
        if (addition3 != null) addition3.printItemReceipt();
        if (addition4 != null) addition4.printItemReceipt();
    }

    public double getPriceTotal() {
        return priceTotal;
    }
}
