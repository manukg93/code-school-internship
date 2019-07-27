package edu.codeschool.training.interfaces.homework6;

abstract public class Human implements Person {
    // member variables of Human
    String name;
    String email;

    // Constructors
    public Human() {
        this.name = "";
        this.email = "";
    }

    public Human(String name, String email) {
        if (name != null) {
            this.name = name;
        }
        if (email != null) {
            this.email = email;
        }
    }

    // Setters
    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public void setEmail(String email) {
        if (email != null) {
            this.email = email;
        }
    }

    // Getters
    public String getName() {return this.name;}

    public String getEmail() {return this.email;}

}
