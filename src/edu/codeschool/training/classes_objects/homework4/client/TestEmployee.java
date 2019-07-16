package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.Employee;

public class TestEmployee extends Employee {
    public static void main(String[] args) {
        Employee employee = new Employee(1,"John","Dow",1000);
        System.out.println(employee.getAnnualSalary());
        employee.raiseSalary(10);
        System.out.println(employee.toString());
    }

}
