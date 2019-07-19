package edu.codeschool.training.classes_objects.homework5.client;

import edu.codeschool.training.classes_objects.homework5.Employee;
import edu.codeschool.training.classes_objects.homework5.PersonExtendsStudent;

public class TestPersonSubClasses {
    public static void main(String[] args) {
        PersonExtendsStudent student = new PersonExtendsStudent("Hayk","Erevan","EPH",5000);
        Employee employee=new Employee("Tiko","Aparan","XXX",10000);
        System.out.println(student);
        System.out.println(employee);
    }

}
