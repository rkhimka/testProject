package com.simple.figures;

public class Rectangle {
    double sideA;
    double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double calcArea() {
        return this.sideA * this.sideB;
    }
}
