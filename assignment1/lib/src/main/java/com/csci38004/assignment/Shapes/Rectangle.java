package com.csci38004.assignment.Shapes;

public class Rectangle implements Shape {
    private double length;
    private double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public double area(){
        return getLength() * getWidth();
    }

    public double perimeter(){
        return (getLength() * 2) + (getWidth() * 2);
    }

    @Override
    public double doubleArea() {
        return area() * 2;
    }

    @Override
    public double doublePerimeter() {
        return perimeter() * 2;
    }
}
