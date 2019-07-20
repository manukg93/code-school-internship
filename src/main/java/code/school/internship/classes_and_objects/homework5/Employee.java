package code.school.internship.classes_and_objects.homework5;

public class Employee extends Person {
    public String office;
    public double salary;

    // Constructors
    public Employee(String name, String address, String office, double salary) {
        super(name, address);
        if (office != null) {
            this.office = office;
        }

        if (salary < 0) {
            System.out.println("Salary must be positive value.");
            this.salary = 0;
            return;
        }
        this.salary = salary;
    }

    // Getters and setters
    public void setOffice(String office) {
        if (office != null) {
            this.office = office;
        }
    }
    public String getOffice() {
        return office;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Salary must be positive value.");
            this.salary = 0;
            return;
        }
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        String employeeInfo = "Employee: " + super.toString() + " Office:" + office + ", Salary:" + salary + "]";
        return employeeInfo;
    }
}