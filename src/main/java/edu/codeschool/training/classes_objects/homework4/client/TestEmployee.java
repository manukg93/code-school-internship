package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e=new Employee(222222,"Hamlet","Sargsyan",195000);
        System.out.println("ID            "+e.getId());
        System.out.println("First Name    "+e.getFirstName());
        System.out.println("Last Name     "+e.getLastName());
        System.out.println("Salary        "+e.getAnnualSalary());
        System.out.println("Raise Salary  "+e.raiseSalary(15));
        System.out.println(e);
    }
}
