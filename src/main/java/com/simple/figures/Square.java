package com.simple.figures;

public class Square {
    double side;

    public Square(int side) {
        this.side = side;
    }

    public double calcArea() {
        return this.side * this.side;
    }
}
