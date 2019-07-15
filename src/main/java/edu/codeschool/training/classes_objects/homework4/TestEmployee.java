package edu.codeschool.training.classes_objects.homework4;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee(1,"John","Johnson",100);
        System.out.println(employee.getAnnualSalary());
        employee.raiseSalary(10);
        System.out.println(employee.toString());
    }
}
