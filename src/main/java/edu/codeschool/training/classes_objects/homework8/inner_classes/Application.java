package edu.codeschool.training.classes_objects.homework8.inner_classes;

import java.util.ArrayList;

public class Application {

    ArrayList<User> users;

    // static fields
    static class ApplicationType {
        // static fields
        static final String FACEBOOK = "1";
        static final  String VIBER = "2";
        static final String GMAIL = "3";
    }

    // default constructor for Application class
    Application() {
        this.users = new ArrayList<User>();
    }

    class User {
        // instance fields
        String userName;
        String password;
        String applicationType;
        boolean isLoggedIn;

        // constructors
        User() {
            this.userName = "";
            this.password = "";
            this.applicationType = "";
            this.isLoggedIn = false;
        }

        User(String userName, String password, String applicationType) {
            this.userName = userName;
            this.password = password;
            this.applicationType = applicationType;
            this.isLoggedIn = false;
        }

        // setters and getters
        public void setUserName(String userName) {
            this.userName = userName;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public void setApplicationType(String applicationType) {
            this.applicationType = applicationType;
        }

        public String getUserName() {
            return userName;
        }

        public String getPassword() {
            return password;
        }

        public String getApplicationType() {
            return applicationType;
        }

        // methods
        void login() {
            this.isLoggedIn = true;
        }

        void logout() {
            this.isLoggedIn = false;
        }

    }

    interface LoggedIn {
        boolean isLoggedIn(User user);
    }

    void addUser(String userName, String password, String applicationType) {
        User user = new User(userName, password, applicationType);
        users.add(user);
    }

    void deleteUser(String userName) {
        // local inner class
        class Finder {

             User find() {
                if (Application.this.users == null) {
                    return null;
                }

                for (User user : users) {
                    if (user.getUserName() == userName) {
                        return user;
                    }
                }
                return null;
            }
        }
        Finder finder = new Finder();

        this.users.remove(finder.find());
    }

    ArrayList<User> allLoggedInUsers() {
         LoggedIn user = new LoggedIn() {
            public boolean isLoggedIn(User user) {
                return user.isLoggedIn;
            }
         };

        ArrayList<User> allLoggedInUsers = new ArrayList<User>();

        for (User el: users) {
            if (user.isLoggedIn(el)) {
                allLoggedInUsers.add(el);
            }
        }
        return allLoggedInUsers;

    }
}
