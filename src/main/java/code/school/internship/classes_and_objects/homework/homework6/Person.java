package code.school.internship.classes_and_objects.homework.homework6;

public class Person /*extends Human */{
    // member variables of Employee
    private String departmentName;

    // Constructors
    public Person() {
        super();
        this.departmentName = "";
    }

    public Person(String name, String email, String departmentName) {
//        super(name, email);

        if (departmentName != null) {
            this.departmentName = departmentName;
        }
    }

    // Setters
    public void setDepartmentName(String name) {
        if (name != null) {
            this.departmentName = name;
        }
    }

    // Getters
    public String getDepartmentName() {return this.departmentName;}

//    @Override
//    public void getDescription() {
//        System.out.println(this.getName() + " works in " + this.getDepartmentName() + " department");
//    }

//    @Override
//    public void view() {
//        this.getDescription();
//    }
}
