package com.company;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String validModel = model.toLowerCase();
        if (validModel.length() < 12 && validModel.length() >= 2){
            this.model = model;
        } else {
            System.out.println("invalid model");
        }

    }

    public String getModel(){
        return this.model;
    }
}
