package code.school.internship.homework4;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(int id, String firstName, String lastName, double salary){

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public double getAnnualSalary(){
        double annualSalary = salary*12;
        return annualSalary;
    }

    public double raiseSalary(int percent){
        double raiseSalary = salary + (salary*percent/100);
        return raiseSalary;
    }

    public String toString() {
        return firstName + lastName + salary + id;

    }
}
