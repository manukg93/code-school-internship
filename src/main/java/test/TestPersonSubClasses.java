package test;

import code.school.internship.homework5.Employee;
import code.school.internship.homework5.Student;

public class TestPersonSubClasses {
    public static void main(String[] args) {
        Student student = new Student("John","Yerevan","Harvard",1500);
        Employee employee = new Employee("Jack","Yerevan","CodeSchool",2000);

        System.out.println(student);
        System.out.println(employee);
     }
}
