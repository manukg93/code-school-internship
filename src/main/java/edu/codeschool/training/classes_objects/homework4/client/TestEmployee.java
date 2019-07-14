package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee=new Employee(555555,"Hayk", "Serobyan", 1000);
        System.out.println(employee.getFirstName()+" "+employee.getLastName()+"'s"+" annual salary is " +employee.getAnnualSalary());
        employee.raiseSalary(10);
        System.out.println(employee);
    }

}
