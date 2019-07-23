package edu.codeschool.training.classes_objects.homework4.client;
import edu.codeschool.training.classes_objects.homework4.homework5.Student;

import java.util.Date;

public class TestStudent {
    public static void main(String[] args) {
        Student st1=new Student("Hamo", 30,new Date(89,3,16));
        Student st2=new Student("Hayk", 30,new Date(89,7,15));
        Student st3=new Student("Vardan",31,new Date(88,3,17));
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(Student.getCount());
    }
}
