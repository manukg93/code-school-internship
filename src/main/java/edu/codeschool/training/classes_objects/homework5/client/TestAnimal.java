package edu.codeschool.training.classes_objects.homework5.client;

import edu.codeschool.training.classes_objects.homework5.Akita;
import edu.codeschool.training.classes_objects.homework5.Animal;
import edu.codeschool.training.classes_objects.homework5.Cat;
import edu.codeschool.training.classes_objects.homework5.Dog;

public class TestAnimal {
    public static void main(String[] args) {
        Animal[] animals = {new Cat("Cat1"), new Dog("Dog1"), new Akita("Akita1"),
                            new Cat("Cat2"), new Dog("Dog2"), new Akita("Akita2")};

        for (int i = 0; i < animals.length; i++) {
            animals[i].greeting();
        }
    }
}
