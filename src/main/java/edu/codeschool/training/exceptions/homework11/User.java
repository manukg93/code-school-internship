package edu.codeschool.training.exceptions.homework11;

public class User {

    String name;
    String email;
    String password;

    public User(String name, String email, String password) {

        this.name = name;
        setEmail(email);
        setPassword(password);
    }

    // setters and getters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {

        if (!email.contains("@")) {
            throw new edu.codeschool.training.exceptions.homework11.IllegalEmailException("Illegal email");
        } else {
            this.email = email;
        }
    }

    public void setPassword(String password) {
        if (password.length() < 8) {
            throw new IllegalPasswordException("Password is too short");
        } else {
            this.password = password;
        }
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(this.getName()).append(", ").append(this.getEmail()).append(", ").append(this.getPassword());

        return buffer.toString();
    }
}
