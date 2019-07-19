package edu.codeschool.training.classes_objects.homework5.client;


import edu.codeschool.training.classes_objects.homework5.Employee;
import edu.codeschool.training.classes_objects.homework5.SubStudent;

public class TestPersonSubClasses {
    public static void main(String[] args) {
        SubStudent student = new SubStudent("Paul", "Armenia, Yerevan", "State University of Yerevan", 200_000);
        Employee employee = new Employee("Aram", "Armenia, Yerevan", "Beeline", 220_000);

        System.out.println(student.toString());
        System.out.println(employee.toString());
    }
}
