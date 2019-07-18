package edu.codeschool.training.classes_objects.homework4;

import edu.codeschool.training.classes_objects.homework4.Date;

public class Author {
    private String name;
    private String email;
    private Date birthDate;
    private String gender;

    //Constructors
    public Author(String name, String email, String gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    //Setters and getters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthDate(int d, int m, int y) {
        birthDate = new Date();
        birthDate.setDay(d);
        birthDate.setMonth(m);
        birthDate.setYear(y);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    //Public methods
    public Author getAuthorName() {
        return  this;
    }

    public String toString() {
        String strAuthor = "Author: [Name: " + name + ", Email: " + email + ", Gender: " + gender + ", Date Of Birth: " + birthDate.toString() + "]";
        return strAuthor;
    }
}
