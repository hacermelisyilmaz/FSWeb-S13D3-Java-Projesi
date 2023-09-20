package com.workintech.d3oop;

public class Person {
    String firstName;
    String lastName;
    int age;
    double height;
    String hairColor;
    boolean hasGlasses;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(double height, String hairColor, boolean hasGlasses) {
        this.height = height;
        this.hairColor = hairColor;
        this.hasGlasses = hasGlasses;
    }
}
