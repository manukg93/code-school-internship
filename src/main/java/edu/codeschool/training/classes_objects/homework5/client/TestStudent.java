package edu.codeschool.training.classes_objects.homework5.client;

import edu.codeschool.training.classes_objects.homework5.Student;

import java.util.Date;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Anna", 20, new Date(4556632));
        Student student2 = new Student("John", 19, new Date(987543));
        Student student3 = new Student("Paul", 21, new Date(5587543));

        System.out.println(Student.getCount());
        System.out.println(student1.toString());

    }
}
