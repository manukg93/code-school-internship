package code.school.internship.homework4.client;


import code.school.internship.homework4.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee(14,"Sargis", "Sargsyan",300);

        employee.setSalary(300);
        System.out.println(employee.getAnnualSalary());
        System.out.println(employee.raiseSalary(10));
    }
}
