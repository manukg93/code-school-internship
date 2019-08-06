package edu.codeschool.training.classes_objects.homework9.client;

import edu.codeschool.training.classes_objects.homework9.exercise2.Address;
import edu.codeschool.training.classes_objects.homework9.exercise2.City;
import edu.codeschool.training.classes_objects.homework9.exercise2.User;

import java.util.Date;

public class UserTest {
    public static void main(String[] args) {
        City city = new City("Yerevan");
        Address address = new Address("Abovyan", city);
        Date date = new Date(6,8,2019);
        User user = new User("John", address, date);
        User user1 = user.clone(user);
        System.out.println(user);
        System.out.println(user1);
    }
}
