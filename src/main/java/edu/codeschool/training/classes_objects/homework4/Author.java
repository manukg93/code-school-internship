package edu.codeschool.training.classes_objects.homework4;

public class Author {
    private String name;
    private String email;
    private Date birthDate;
    private String gender;
    private int id;

    public Author(int id, String name, String email, String  gender) {
        this.id=id;
        this.name = name;
        this.email = email;
        this.gender=gender;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name =name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getAuthorName(){
        return name;
    }
}
