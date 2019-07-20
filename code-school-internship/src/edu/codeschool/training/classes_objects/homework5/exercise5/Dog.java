package edu.codeschool.training.classes_objects.homework5.exercise5;

public class Dog extends  Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String greeting() {
        String str = "wow";
        return str;
    }
}
