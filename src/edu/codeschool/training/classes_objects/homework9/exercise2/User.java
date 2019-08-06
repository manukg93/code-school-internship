package edu.codeschool.training.classes_objects.homework9.exercise2;

import java.util.Date;

public class User implements Cloneable{
    private final String name;
    private final Address address;
    private final Date birthDay;



    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public User(String name, Address address, Date birthDay) {
        this.name = name;
        this.address = address;
        this.birthDay = birthDay;
    }

    public User clone(User anotherUser){
        return new User(anotherUser.getName(), anotherUser.getAddress(), anotherUser.getBirthDay());
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", address=" + address +
                ", birthDay=" + birthDay +
                '}';
    }
}
