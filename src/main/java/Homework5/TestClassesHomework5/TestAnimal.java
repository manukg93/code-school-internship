package Homework5.TestClassesHomework5;

import Homework5.ClassesHomework5.Animal;
import Homework5.ClassesHomework5.Cat;

public class TestAnimal {
    public static void main(String[] args) {
        Animal[] animals = {new Cat("C1"), new Cat("A2"), new Cat("A3"), new Cat("A4")};
        for (int i = 0; i < animals.length; i++){
            animals[i].greeting();
        }
    }

}
