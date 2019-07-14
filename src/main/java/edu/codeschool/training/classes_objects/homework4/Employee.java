package edu.codeschool.training.classes_objects.homework4;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getAnnualSalary(){
        return salary*12;
    }
    public double raiseSalary(int percent){
        this.salary=salary+salary*percent/100;
        return this.salary;
    }

    public String toString(){
        return "id="+this.id+ " , name="+this.firstName +" "+this.lastName+" , salary="+ this.salary;
    }

}
