package com.noynaert.csc254.shapes;

public abstract class GeometricShape {
    public abstract double getArea();
    public abstract String getName();

    public String toString(){
        String s = String.format("%s has an area of %1.2f",getName(),getArea());
        return s;
    }
}
