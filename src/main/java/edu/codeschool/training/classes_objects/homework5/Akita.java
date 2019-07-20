package edu.codeschool.training.classes_objects.homework5;

public class Akita extends Dog {

    //Constructors
    public Akita(String name) {
        super(name);
    }

    @Override
    public void greeting() {
        System.out.println("Hello " + super.getName());
    }
}
