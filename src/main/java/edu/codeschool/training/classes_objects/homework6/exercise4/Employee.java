package edu.codeschool.training.classes_objects.homework6.exercise4;

public class Employee implements Person {
    private String departmentName;

    public Employee(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public String getDescription() {
        return "Employee of "+getDepartmentName()+" department" ;
    }
}
