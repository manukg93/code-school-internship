package edu.codeschool.training.classes_objects.homework5.client;

import edu.codeschool.training.classes_objects.homework5.Student;
import java.util.Date;
public class TestStudent {
    public static void main(String[] args) {
        Student s1=new Student("Tiko",28,new Date(91,3,10));
        Student s2=new Student("Hamo",30,new Date(89,4,16));
        Student s3=new Student("Hayk",30,new Date(89,8,15));
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("Created objects of type Student is : "+ Student.getCount());
    }
}
