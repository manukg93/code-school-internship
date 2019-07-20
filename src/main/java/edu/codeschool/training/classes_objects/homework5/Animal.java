package edu.codeschool.training.classes_objects.homework5;

abstract public class Animal {
    private String name;

    // Abstract public method
    abstract public void greeting();

    // Constructors
    public Animal() {
        name = "Animal";
    }

    public Animal(String name) {
        this.name = name;
    }

    // Getters and setters
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
