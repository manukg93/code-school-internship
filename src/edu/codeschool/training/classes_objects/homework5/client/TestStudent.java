package edu.codeschool.training.classes_objects.homework5.client;

import edu.codeschool.training.classes_objects.homework5.Student;

import java.util.Calendar;
import java.util.Date;

public class TestStudent {
    public static void main(String[] args) {
        Student student1 = new Student("Trump",20,  new Date(1990,3,30));
        Student student2 = new Student("Bush",20,  new Date(1990, Calendar.APRIL,20));
        Student student3 = new Student("Obama",20,  new Date(1990, Calendar.APRIL,10));
        System.out.println(Student.count);
//        System.out.println(student1);
    }
}
