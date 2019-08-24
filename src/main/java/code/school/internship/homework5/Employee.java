package code.school.internship.homework5;

public class Employee extends Person {
     String office;
     double salary;
     int c;


    public Employee(String name, String address,String office,double salary) {
        super(name, address);
        this.office = office;
        this.salary = salary;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getOffice() {
        return office;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name+" "+address+" "+office+" "+salary;
    }
}
