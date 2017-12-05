package com.noynaert.csc254.shapes;

public class Rectangle extends Polygon {
    double length;
    double width;

    public Rectangle(double length, double width) {
        super(4);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }
    @Override
    public String toString(){
        String s = super.toString();
        s += String.format(" (%1.1f x %1.1f)", length, width);
        return s;
    }
    public final void doSomething(){

    }
}
