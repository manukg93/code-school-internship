package Homework5.TestClassesHomework5;

import Homework5.ClassesHomework5.Animal;
import Homework5.ClassesHomework5.Cat;
import Homework5.ClassesHomework5.Dog;

public class TestAnimal {
    public static void main(String[] args) {
        Animal[] animal = {new Cat ("Kitty1"), new Cat("Kitty2"), new Cat ("Kitty3"),
                new Dog ("Dog1"), new Dog("Dog2"), new Dog("Dog3")};
        for (int i = 0; i < animal.length; i++){
            animal[i].greeting();
        }
    }

}
