package edu.codeschool.training.classes_objects.homework4;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    // Constructors
    public Employee(int id, String firstName, String lastName, double salary) {
        if (id > 0) {
            this.id = id;
        } else {
            this.id = 0;
            System.out.println("Wrong id: " + id);
        }

        this.firstName = firstName;
        this.lastName = lastName;

        if (salary >= 0) {
            this.salary = salary;
        } else {
            salary = 0;
            System.out.println("Wrong salary value.");
        }
    }

    // Getter and setter methods
    public void setId (int id) {
        if (id > 0) {
            this.id = id;
        } else {
            this.id = 0;
            System.out.println("Wrong id " + id + " passed!");
        }
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    public void setSalary (double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            salary = 0;
            System.out.println("Wrong salary entered.");
        }
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    // Public methods
    public double getAnnualSalary() {
        return 12 * salary;
    }

    public void raiseSalary(int percent) {
        this.salary = (percent * salary / 100) + salary;
    }

    public String toString () {
        String stringRepresentation = "Employee [id = " + id + ", " + firstName + " " + lastName + ", salary = " + salary;
        return stringRepresentation;

    }
}
