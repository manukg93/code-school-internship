package edu.codeschool.training.classes_objects.homework4.homework5;

public class Employee extends Person {
    String office;
    double salary;

    public Employee(String office, double salary) {
        this.office = office;
        this.salary = salary;
    }

    public Employee(String name, String address, String office, double salary) {
        super(name, address);
        this.office = office;
        this.salary = salary;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "office='" + office + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
