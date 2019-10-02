package com.csci38004.assignment.Shapes;

public class Cylinder extends Circle implements Shape3D{
    private double height;

    Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double volume(){
        return area() * getHeight();
    }

    @Override
    public double doubleVolume() {
        return volume() * 2;
    }

}
