package edu.codeschool.training.classes_objects.homework6.exercise4;

public class Lecturer implements Person {
    private String subject;

    public Lecturer(String subject) {
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String getDescription() {
        return "Teaches "+getSubject() ;
    }
}
