package edu.codeschool.training.classes_objects.homework4.client;
import edu.codeschool.training.classes_objects.homework4.homework5.Cat;
import edu.codeschool.training.classes_objects.homework4.homework5.Dog;
import edu.codeschool.training.classes_objects.homework4.homework5.Akita;
import edu.codeschool.training.classes_objects.homework4.homework5.Animal;
public class TestAnimal {
    public static void main(String[] args) {
        Animal[] animals = {new Cat("C1"), new Dog("D1"), new Akita("A1"),
                new Cat("C2"), new Dog("D2"), new Akita("A2")};
        for (int i = 0; i < animals.length; i++) {
            animals[i].greeting();

        }
    }
}