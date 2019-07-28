package Homework7;

import java.util.Objects;

public class Department {
    String name;
    int employeeCount;
    public Department(String name, int employeeCount) {
        this.name = name;
        this.employeeCount = employeeCount;
    }
    public String getName() { return name; }
    public void setName(String givenName) { this.name = givenName; }
    public int getEmployeeCount() { return employeeCount; }
    public void setEmployeeCount(int givenEmployeeCount) { this.employeeCount = givenEmployeeCount; }

    @Override
    public String toString() {
        return "[" + name + " " + employeeCount + " " + "]";
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        Department that = (Department) obj;
        if (this.name !=that.name) return false;
        return true;
    }
}
