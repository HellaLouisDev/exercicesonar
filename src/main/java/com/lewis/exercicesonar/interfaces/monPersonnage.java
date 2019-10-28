package com.lewis.exercicesonar.interfaces;

public abstract class monPersonnage {

    String firstName;
    String lastName;
    int age;

    public monPersonnage(){};

    public monPersonnage(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
