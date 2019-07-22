package Homework5.TestClassesHomework5;

import Homework5.ClassesHomework5.Employee;
import Homework5.ClassesHomework5.StudentPerson;

public class PersonSubClasses {
    public static void main(String[] args){
        StudentPerson student = new StudentPerson("Mane Zakaryan", "Alek-Manukyan street", "ASUE", 550000);
        Employee employee = new Employee("Mane Zakaryan", "Elit Plaza", "HS", 50);
        System.out.println(student.toString());
        System.out.println(employee.toString());
    }
}
