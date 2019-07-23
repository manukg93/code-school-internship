package edu.codeschool.training.classes_objects.homework4.homework5;

public abstract class Animal {
    private String name;

    public abstract void greeting();



    public Animal(String name) {
        this.name = name;
    }


    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}


