package edu.codeschool.training.classes_objects.homework6.exercise4;

public class Lecturer implements Person {
    private String name;
    private String email;
    private String subject;

    public Lecturer(){
    }
    public Lecturer(String name, String email, String subject) {
        this.name = name;
        this.email = email;
        this.subject = subject;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public  String getDescription(){
        return "Teaches " + this.subject;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
