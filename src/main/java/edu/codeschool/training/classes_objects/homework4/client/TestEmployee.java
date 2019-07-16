package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "John", "Smith", 1500);

        System.out.println("Annual salary: " + employee.getAnnualSalary());
        // Raise the salary by 10 percent
        employee.raiseSalary(10);
        System.out.println(employee.toString());
    }
}
