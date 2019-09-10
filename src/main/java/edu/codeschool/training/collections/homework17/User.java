package edu.codeschool.training.collections.homework17;

import java.util.Comparator;

public class User {
    private String name;
    private int age;
    private String email;

    // default constructor
    public User() {
        this.name = null;
        this.age = 0;
        this.email = null;
    }
    //
    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() { return this.name; }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder userToString = new StringBuilder();
        userToString.append("[").append(this.name).append(", ").append(this.age).append(", ").append(this.email).append("]");
        return userToString.toString();
    }
}
