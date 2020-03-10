package com.company;

public class DeluxeBurger extends Burger{
    private Additions deluxeAdditions;


    public DeluxeBurger(String rollType, Additions additions) {
        super("Deluxe Burger", rollType, 2, additions);
        deluxeAdditions = new Additions(new Addition("chips", 1.50), new Addition("soda", 1.75));
        super.setTotal(super.getTotal() + deluxeAdditions.getPriceTotal());
    }

    @Override
    public void getAdditionsListPricing() {
        super.getAdditionsListPricing();
        deluxeAdditions.getListPricing();
    }
}
