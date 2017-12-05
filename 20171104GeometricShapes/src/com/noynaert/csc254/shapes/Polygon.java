package com.noynaert.csc254.shapes;

public abstract class Polygon extends GeometricShape {
    int sides;

    protected Polygon(int sides){
        this.sides = sides;
    }
    public int getSides(){
        return sides;
    }
    public String toString(){
        String s = super.toString();
        s += String.format(" and has %d sides", getSides());
        return s;
    }
}
