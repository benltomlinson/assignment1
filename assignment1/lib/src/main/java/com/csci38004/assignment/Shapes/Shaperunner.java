package com.csci38004.assignment.Shapes;

public class Shaperunner{

    public static void main(String[] args) {
        Shape circle = new Circle(2.0);
        Shape rectangle = new Rectangle(4.0, 2.0);
        Shape3D cylinder = new Cylinder(4.0, 1.0);

        System.out.println("Circle:");
        System.out.println("Area: " + circle.area() + ". Perimeter: " + circle.perimeter());
        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.area() + ". Perimeter: " + rectangle.perimeter());
        System.out.println("\nCylinder:");
        System.out.println("Volume: " + cylinder.volume());
    }
}
