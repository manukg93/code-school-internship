package Homework5.ClassesHomework5;

public class Employee extends Person{
    String office;
    int salary;
    public Employee(String name, String adress, String office, int salary) {
        this.name=name;
        this.adress=adress;
        this.office=office;
        this.salary=salary;
    }
    public String getOffice() { return office; }
    public double getSalary() { return salary; }
    public void setOffice(String office) {
        this.office = office;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " Office is: " + office + " Adresse: " + adress + " Salary: " + salary;
    }
}
