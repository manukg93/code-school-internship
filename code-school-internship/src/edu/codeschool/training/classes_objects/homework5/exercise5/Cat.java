package edu.codeschool.training.classes_objects.homework5.exercise5;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String greeting() {
        String str = "mew";
        return str;
    }
}
