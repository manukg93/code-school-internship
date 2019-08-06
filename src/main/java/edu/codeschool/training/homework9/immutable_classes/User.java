package edu.codeschool.training.homework9.immutable_classes;

import java.util.Date;

public final class User implements Cloneable {
    // instance fields
    final String name;
    final Address address;
    final Date birthday;

    // constructors
    public User(String name, String street, String cityName, Date birthday) {
        this.name = name;
        this.address = new Address(street, cityName);
        this.birthday = birthday;
    }

    public User(String name, Address address, Date birthday) {
        this.name = name;
        this.address = address;
        this.birthday = birthday;
    }

    public String getName () {
        return this.name;
    }

    public Address getAddress () {
        return this.address;
    }

    public Date getBirthday() {
        return this.birthday;
    }

    @Override
    public String toString() {
        return "User [" + this.name + ", " + this.address.toString() + ", Birthday: " + this.birthday.toString() + "]";
    }

    @Override
    public User clone() throws CloneNotSupportedException{
        return (User) super.clone();
    }
}
