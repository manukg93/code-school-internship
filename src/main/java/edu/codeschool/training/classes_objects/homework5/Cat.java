package edu.codeschool.training.classes_objects.homework5;

public class Cat extends Animal {

    // Constructors
    public Cat(String name) {
        super(name);
    }

    @Override
    public void greeting() {
        System.out.println("Hello " + super.getName());
    }
}
