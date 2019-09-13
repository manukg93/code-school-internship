package edu.codeschool.training.homework17.client;

import edu.codeschool.training.homework17.exercise3.Application;
import edu.codeschool.training.homework17.exercise3.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestApplication {
    public static void main(String[] args) {
        ArrayList<User> app = (ArrayList<User>) Application.readUsersFromFile("users.txt");
        Collections.sort(app, new UserAgeComparator());

        for(User user: app){
            System.out.println(user);
        }
    }
}

class UserAgeComparator implements Comparator<User> {

    @Override
    public int compare(User user1, User user2) {
        return user1.compareTo(user2);
    }
}