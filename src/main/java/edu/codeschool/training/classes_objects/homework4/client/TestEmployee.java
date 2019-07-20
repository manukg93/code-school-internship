package edu.codeschool.training.classes_objects.homework4.client;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Zakaryan", "Mane", 50);
        System.out.println("The Employee Data is ");
        System.out.println("id = " + employee.getid());
        System.out.println("Fisrt Name = " + employee.getFirstName());
        System.out.println("Last Name = " + employee.getLastName());
        System.out.println("Salary = " + employee.getSalary());

        System.out.println("New Data is with raised salary ");
        Employee employee1 = new Employee(1, "Zakaryan", "Mane", 50 );
        employee1.RaiseSalary(20);
        System.out.println(employee1.ToString());
    }
}
