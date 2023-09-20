package com.workintech.d3oop;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("LastName: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        Person person2 = new Person("Melis", "Yilmaz", 24);
        System.out.println("Firstname: " + person2.getFirstName());
        System.out.println("LastName: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
    }
}