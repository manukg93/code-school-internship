package Homework8;

import java.util.ArrayList;

public class Application {
    static ArrayList<User> users;

    static class ApplicationType {
        static final String facebook = "Facebook";
        static final String viber = "Viber";
        static final String gmail = "Gemail";
    }

    Application() {
        this.users = new ArrayList<User>();
    }

    static class User {
        String userName;
        String password;
        String applicationType;
        boolean isLoggedIn = false;
        User() {
            this.userName = "Name";
            this.password = "Password";
            this.applicationType = "Application Type";
            this.isLoggedIn = false;
        }

        User(String userName, String password, String applicationType) {
            this.userName = userName;
            this.password = password;
            this.applicationType = applicationType;
            this.isLoggedIn = false;
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

        public void setUserName(String givenUserName) {
            this.userName = givenUserName;
        }

        public void setPassword(String givenPassword) {
            this.password = givenPassword;
        }

        public void setApplicationType(String givenApplication) {
            this.applicationType = givenApplication;
        }

        void login() {
            this.isLoggedIn = true;
        }

        void logout() {
            this.isLoggedIn = false;
        }
        interface LoggedIn {
            boolean isLoggedIn(User user);
        }

        void addUser(String userName, String password, String applicationType) {
            User user = new User(userName, password, applicationType);
            users.add(user);
        }

        void deleteUser(String userName) {
            class Finder {
                User find() {
                    if (users == null) {
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
        }
        ArrayList<User> allLoggedInUsers() {
            LoggedIn user = new LoggedIn() {

                @Override
                public boolean isLoggedIn(User user) {
                    return user.isLoggedIn;
                }
            };
            ArrayList<User> allLoggedInUsers = new ArrayList<User>();

            for (User elements: users) {
                if (user.isLoggedIn(elements)) {
                    allLoggedInUsers.add(elements);
                }
            }
            return allLoggedInUsers;
        }
    }
}
