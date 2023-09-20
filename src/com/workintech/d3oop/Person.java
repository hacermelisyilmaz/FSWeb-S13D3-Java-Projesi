package com.workintech.d3oop;

public class Person {
    String firstName;
    String lastName;
    int age;
    double height;
    String hairColor;
    boolean hasGlasses;
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public boolean isTeen() {
        return age <= 19 && age >= 13;
    }

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
