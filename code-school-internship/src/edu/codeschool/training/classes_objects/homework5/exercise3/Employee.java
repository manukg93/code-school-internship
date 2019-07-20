package edu.codeschool.training.classes_objects.homework5.exercise3;

public class Employee extends Person {
    private String office;
    private double salary;

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
        return "Name: " + this.getName() + ", Address: " + super.getAddress() + ", Office: "
                + this.office + ", Salary: " + this.salary;
    }
}
