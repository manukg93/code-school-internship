package edu.codeschool.training.classes_objects.homework9_ImmutableClass;

import java.util.Date;

public class TestUser {
    public static void main(String[] args) {
        User user = new User("Hayk", "Shahumyan 1st street", "Yerevan", new Date(89,07,15));
        System.out.println(user);
    }
}
