package edu.codeschool.training.classes_objects.homework5;

public class Dog extends Animal {

    // Constructor
    public Dog(String name) {
        super(name);
    }

    @Override
    public void greeting() {
        System.out.println("Hello " + super.getName());
    }
}
