package edu.codeschool.training.classes_objects.homework5.client;

import edu.codeschool.training.classes_objects.homework5.exercise3.Employee;
import edu.codeschool.training.classes_objects.homework5.exercise3.Students;

public class TestPersonSubClasses {
    public static void main(String[] args) {
        Students student = new Students("John", "Armenia,Armavir", "YSUAC", 50);
        Employee employee = new Employee("Dow", "Russia,Moskow", "Yandex", 8000);

        System.out.println(student.toString());
        System.out.println(employee.toString());
    }
}
