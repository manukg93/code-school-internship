package edu.codeschool.training.classes_objects.homework7.exercise2;

public class Department {
    private String name;
    private long employeeCount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getEmployeeCount() {
        return employeeCount;
    }

    public void setEmployeeCount(long employeeCount) {
        this.employeeCount = employeeCount;
    }

    public Department() {

    }
    public Department(String name, long employeeCount) {
        this.name = name;
        this.employeeCount = employeeCount;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", employeeCount=" + employeeCount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
