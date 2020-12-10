package com.company;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add (ComplexNumber comNum){
        this.real += comNum.getReal();
        this.imaginary += comNum.getImaginary();
    }

    public void add(double real, double imaginary) {
        add(new ComplexNumber(real, imaginary));
    }

    public void subtract (ComplexNumber comNum){
        this.real -= comNum.getReal();
        this.imaginary -= comNum.getImaginary();
    }

    public void subtract(double real, double imaginary) {
        subtract(new ComplexNumber(real, imaginary));
    }
}
