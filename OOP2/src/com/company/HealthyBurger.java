package com.company;

public class HealthyBurger extends Burger {
    private Additions extraAdditions;

    public HealthyBurger(String name, Additions additions, Additions extraAdditions) {
        super(name, "Rye Bread Roll", 0, additions);
        this.extraAdditions = extraAdditions;
        super.setTotal(super.getTotal() + extraAdditions.getPriceTotal());
    }

    @Override
    public void getAdditionsListPricing() {
        super.getAdditionsListPricing();
        extraAdditions.getListPricing();
    }
}
