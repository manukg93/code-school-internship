package edu.codeschool.training.classes_objects.homework8.exercise1;

import java.util.Arrays;

public class Application {
    String[] users = {};
    User[] usersObj = {};

    public String[] getUsers() {
        return users;
    }

    public void setUsers(String[] users) {
        this.users = users;
    }

    public User[] getUsersObj() {
        return usersObj;
    }

    public void setUsersObj(User[] usersObj) {
        this.usersObj = usersObj;
    }

    //    ?
    public static class ApplicationType{
       final static String FACEBOOK = "FACEBOOK";
       final static String VIBER = "VIBER";
       final static String GMAIL = "GMAIL";
    }
//    ?
       public static String[] add(String[] arr, String element){
            String[] tempArr = new String[arr.length+1];

            for(int i=0; i < arr.length; i++){
                tempArr[i] = arr[i];
            }
                tempArr[arr.length] = element;
            return tempArr;

        }

       public static String[] remove(String[] arr, String element){
           String[] tempArr = new String[arr.length-1];
            boolean b = false;
           for(int i=0; i < arr.length; i++){
               if(arr[i] == element){
                   arr[i] = "";
                   b = true;
               }

               if(i!=arr.length-1){
                   if(b){
                       tempArr[i] = arr[i+1];
                   }else{
                       tempArr[i] = arr[i];
                   }
               }


           }
           return tempArr;

        }
       public static User[] add(User[] arr, User element){
            User[] tempArr = new User[arr.length+1];

            for(int i=0; i < arr.length; i++){
                tempArr[i] = arr[i];
            }
                tempArr[arr.length] = element;
            return tempArr;

        }

       public static User[] remove(User[] arr, User element){
           User[] tempArr = new User[arr.length-1];
            boolean b = false;
           for(int i=0; i < arr.length; i++){
               if(arr[i] == element){
                   arr[i] = null;
                   b = true;
               }

               if(i!=arr.length-1){
                   if(b){
                       tempArr[i] = arr[i+1];
                   }else{
                       tempArr[i] = arr[i];
                   }
               }
           }
           return tempArr;

        }


    public class User{
        private String userName;
        private String password;
        private String applicationType;
        private boolean isLoggedIn = false;

        public User(String userName, String password, String applicationType) {
            this.userName = userName;
            this.password = password;
            this.applicationType = applicationType;
            setArray();
        }

        void setArray(){
            Application.this.users = add(Application.this.users, this.userName);
            Application.this.usersObj = add(Application.this.usersObj, this);
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getApplicationType() {
            return applicationType;
        }

        public void setApplicationType(String applicationType) {
            this.applicationType = applicationType;
        }

        public boolean isLoggedIn() {
            return isLoggedIn;
        }

        public void setLoggedIn(boolean loggedIn) {
            isLoggedIn = loggedIn;
        }

        public void login(){
            this.isLoggedIn = true;
        }
        public void logout(){
            this.isLoggedIn = false;
        }

        @Override
        public String toString() {
            return "User{" +
                    "userName='" + userName + '\'' +
                    ", password='" + password + '\'' +
                    ", applicationType='" + applicationType + '\'' +
                    ", isLoggedIn=" + isLoggedIn +
                    '}';
        }
    }

    public interface LoggedIn{
        boolean isLoggedIn(User user);
    }

    public void addUser(String userName, String password, String applicationType){
        User user = new User(userName, password, applicationType);
    }


    public void deleteUser(String userName){
//        class Finder{
            Application.this.users = Application.remove(Application.this.users, userName);
//        }
    }

    public User[] allLoggedInUsers(){
        User[] loggedInUsersObj = {};
            LoggedIn loggedIn = new LoggedIn(){
                @Override
                public boolean isLoggedIn(User user) {
//                    System.out.println(user.isLoggedIn);
                    if(user.isLoggedIn)
                        return true;
                    return false;
                }
            };
        for(int i = 0; i < this.usersObj.length; i++) {
            System.out.println(loggedIn.isLoggedIn(this.usersObj[i]));
            if(loggedIn.isLoggedIn(this.usersObj[i]))
                loggedInUsersObj = add(loggedInUsersObj, this.usersObj[i]);
        }
        return loggedInUsersObj;
    }

    @Override
    public String toString() {
        return "Application{" +
                "users=" + Arrays.toString(users) +
                ", usersObj=" + Arrays.toString(usersObj) +
                '}';
    }
}
