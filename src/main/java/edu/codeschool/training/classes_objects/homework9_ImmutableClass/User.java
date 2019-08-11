package edu.codeschool.training.classes_objects.homework9_ImmutableClass;


import java.util.Date;

public final class User {
    final String NAME;
    final Address ADDRESS;
    final Date BIRTHDAY;

    public User(String NAME, Address ADDRESS, Date BIRTHDAY) {
        this.NAME = NAME;
        this.ADDRESS = ADDRESS;
        this.BIRTHDAY = BIRTHDAY;
    }

    public User(String name, String street, String cityName, Date birthday) {
        this.NAME = name;
        this.ADDRESS = new Address(street, cityName);
        this.BIRTHDAY = birthday;
    }

    public String getNAME() {
        return NAME;
    }

    public Address getADDRESS() {
        return ADDRESS;
    }

    public Date getBIRTHDAY() {
        return BIRTHDAY;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    @Override
    public String toString() {
        return "User{ " +
                this.NAME  +
                ", ADDRESS=" + this.ADDRESS.toString() +
                ", BIRTHDAY=" + this.BIRTHDAY.toString() +
                '}';
    }
}
