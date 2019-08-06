package edu.codeschool.training.homework9.immutable_classes;

public class City {
    // instance variables
    String name;

    //
    // default constructor
    public City() {
        this.name = "city";
    }

    // parameterized constructor
    public City(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    // setters and getters
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "" + this.name;
    }
}
