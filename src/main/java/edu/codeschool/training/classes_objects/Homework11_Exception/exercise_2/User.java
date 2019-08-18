package edu.codeschool.training.classes_objects.Homework11_Exception.exercise_2;

public class User {
    String name;
    String email;
    String password;

    public User() {
        this.name = "Hayk";
        this.email = "hayk.serobyan.89@mail.ru";
        this.password = "12345678";
    }

    public User(String name, String email, String password) {
        this.name = name;
        if(email.indexOf("@")!=-1){
            this.email=email;
        }else throw new IllegalEmailException("Your email must be contains '@' !!!");
        if(password.length()>8){
            this.password = password;
        }else throw new IllegalPasswordException("Your password is short !!!");
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
        if(email.indexOf("@")!=-1){
            this.email=email;
        }else throw new IllegalEmailException("Your email must be contains '@' !!!");
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length()>8){
            this.password = password;
        }else throw new IllegalPasswordException("Your password is short !!!");

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
