package edu.codeschool.training.classes_objects.homework9_ImmutableClass;


import java.util.Date;

public final class User {
    final String NAME="Hayk";
    final Address ADDRESS=new Address("Shahumyan 1st",new City("Erevan"));
    final Date BIRTHDAY=(new Date(89,07,15));

    @Override
    public String toString() {
        return "User{" +
                "NAME='" + NAME + '\'' +
                ", ADDRESS=" + ADDRESS +
                ", BIRTHDAY=" + BIRTHDAY +
                '}';
    }
}
