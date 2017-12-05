package com.noynaert.csc254.shapes;

public class Circle extends GeometricShape {
    double radius = 1;

    public Circle (double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
