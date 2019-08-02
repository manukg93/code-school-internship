package edu.codeschool.training.classes_objects.homework8.client;

import edu.codeschool.training.classes_objects.homework8.exercise1.Application;

import java.util.Arrays;

public class CreateUser {
    public static void main(String[] args) {
        Application application = new Application();
        Application.User user = application.new User("John", "123456", "GMAIL");
        Application.User user2 = application.new User("John 2", "123456", "GMAIL");
        application.addUser("Down", "123456", "FACEEBOOK");
//        System.out.println(user);
        user.login();
        user2.login();
//        System.out.println(user);
//        System.out.println(application);
//        application.deleteUser("John");
//        System.out.println(application);
//        System.out.println();
        System.out.println(Arrays.toString(application.getUsersObj()));
        System.out.println(Arrays.toString(application.allLoggedInUsers()));
//        Application.User[] userLogin = application.allLoggedInUsers();
//        for (int i = 0; i < userLogin.length; i++){
//            System.out.println(userLogin[i]);
//        }

    }
}
