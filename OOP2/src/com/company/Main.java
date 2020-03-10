package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Addition lettuce = new Addition("lettuce", 0.10);
        Addition tomato = new Addition("tomato", 0.20);
        Addition cheese = new Addition("cheese", 0.50);
        Addition bacon = new Addition("bacon", 1.25);
        Addition cucumber = new Addition("cucumber", 0.25);
        Addition hummus = new Addition("hummus", 0.50);
        Addition chips = new Addition("chips", 1.50);
        Addition soda = new Addition("soda", 1.75);

        Burger myBurger = new Burger("My Burger", "Dutch Crunch Roll", 1, new Additions(lettuce, tomato, cheese, bacon));
        HealthyBurger myHealthyBurder = new HealthyBurger("My Healthy Burger", new Additions(lettuce, tomato), new Additions(cucumber, hummus));
        DeluxeBurger myDeluxeBurger = new DeluxeBurger("Dark Rye", new Additions(cheese, cheese, bacon, bacon));

        myBurger.printOut();
        System.out.println();
        myHealthyBurder.printOut();
        System.out.println();
        myDeluxeBurger.printOut();
    }
}
