package edu.codeschool.training.classes_objects.homework4.client;

public class Employee {
    int id;
    String FirstName;
    String LastName;
    double salary;
    Employee() { // Default constructors
        id = 0;
        FirstName = "First Name";
        LastName = "Last Name";
        salary = 0.0;
    }
    Employee(int a, String str1, String str2, double d) {
        id = a;
        FirstName = str1;
        LastName = str2;
        salary = d;
    }
    public int getid() { return id; }
    public void setid() { this.id = id; }
    public String getFirstName(){ return FirstName; }
    public void setFirstName() { this.FirstName = FirstName; }
    public String getLastName() { return LastName; }
    public void setLastName() { this.LastName = LastName; }
    public double getSalary() { return salary; }
    public void setSalary() { this.salary = salary; }
    public double AnnualSalary(){
        return salary * 12;
    }
    public double RaiseSalary(int GivenPercent) {
        return salary += (salary / 100) * GivenPercent;
    }
    public String ToString(){
        return id + " " + FirstName + " " + LastName + " " + salary;
    }
}

