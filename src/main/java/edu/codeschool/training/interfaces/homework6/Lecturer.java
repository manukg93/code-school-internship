package edu.codeschool.training.interfaces.homework6;

public class Lecturer extends Human {
    // member variables of Lecturer
    private String subject;

    // Constructors
    public Lecturer() {
        super();
        this.subject = "";
    }

    public Lecturer(String name, String email, String subject) {
        super(name, email);

        if (subject != null) {
            this.subject = subject;
        }
    }

    // Setters
    public void setSubject(String subject) {
        if (subject != null) {
            this.subject = subject;
        }
    }

    // Getters
    public String getSubject() {return this.subject;}

    @Override
    public void getDescription() {
        System.out.println(this.getName() + " teaches " + this.getSubject());
    }

    @Override
    public void view() {
        this.getDescription();
    }
}
