package edu.codeschool.training.interfaces.homework6;

public class Student extends Human {
    // member variables of Student class
    private char grade;

    // Constructors
    public Student() {
        super();
        this.grade = 'A';
    }

    public Student(String name, String email, char grade) {
        super(name, email);

        if (grade >= 'A' && grade <= 'F') {
            this.grade = grade;
        }
    }

    // Setters
    public void setGrade(char grade) {
        if (grade >= 'A' && grade <= 'F') {
            this.grade = grade;
        }
    }

    // Getters
    public char getGrade() { return this.grade; }

    @Override
    public void getDescription() {
        System.out.println("A " + "'" + getGrade() + "' grade student");
    }
}
