package code.school.internship.classes_and_objects.homework.homework6;

public class Student implements Person{
    private String name;
    private  String email;
    private char courseGrade;

    public Student(String name, String email, char courseGrade) {
        this.name = name;
        this.email = email;
        this.courseGrade = courseGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getCourseGrade() {
        return courseGrade;
    }

    public void setCourseGrade(char courseGrade) {
        this.courseGrade = courseGrade;
    }

    @Override
    public String getDescription() {
        return "A "+courseGrade+" grade student" ;
    }
}