package com.csci38004.assignment;

public class Primitives {
    private
        String name;
        int age;
        double payPerHour;
        char gender;
        boolean employed;


    private void print() {
        System.out.print("Name: ");
        System.out.println(name);
        System.out.print("Age: ");
        System.out.println(age);
        System.out.print("Pay per Hour ");
        System.out.println(payPerHour);
        System.out.print("Gender: ");
        System.out.println(gender);
        System.out.print("Employed: ");
        System.out.println(employed);

    }

    Primitives(String name, int age, double payPerHour, char gender, boolean employed){
        this.name = name;
        this.age = age;
        this.payPerHour = payPerHour;
        this.gender = gender;
        this.employed = employed;
    }

    public static void main(String[] args){
        Primitives primitives = new Primitives("Ben", 30, 50.75, 'm', true);
        primitives.print();
    }
}
