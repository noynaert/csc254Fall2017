package com.noynaert.csc254.shapes;

public class Square extends Rectangle implements RegularPolygon {
    public Square(double length) {
        super(length, length);
    }
    public String getName(){
        return "Square";
    }

}
