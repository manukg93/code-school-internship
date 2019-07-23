package edu.codeschool.training.classes_objects.homework6.exercise4;

public class Student implements Person {
    private String name;
    private String email;
    private String grade;

    public Student(String name, String email, String grade) {
        this.name = name;
        this.email = email;
        this.grade = grade;
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

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDescription(){
        return  this.grade + " grade student";
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
