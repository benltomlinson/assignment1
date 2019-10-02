package com.csci38004.assignment.Shapes;

public class Circle implements Shape {
    private double radius;
    private double pi = 3.14;

    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getPi(){
        return pi;
    }

    public double area(){
        return getRadius() * getRadius() * getPi();
    }

    public double perimeter(){
        return getRadius() * 2 * getPi();
    }

    @Override
    public double doublePerimeter() {
        return perimeter() * 2;
    }

    @Override
    public double doubleArea() {
        return area() * 2;
    }
}
