package code.school.internship.classes_and_objects.homework.homework7;


public class Department {
    // fields
    String name;
    long employeeCount;

    // Constructors
    public Department() {
        this.name = "department";
        this.employeeCount = 0;
    }

    public Department(String name, long employeeCount) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "department";
        }

        if (employeeCount > 0) {
            this.employeeCount = employeeCount;
        } else {
            this.employeeCount = 0;
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        Department other = (Department) object;
        if (this.name == other.name) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Department: [name: " + this.name + ", number of employees: " + this.employeeCount + "]";
    }
}
