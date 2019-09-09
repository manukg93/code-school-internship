package edu.codeschool.training.collections.homework17;

import java.io.*;
import java.util.ArrayList;

public class Application {
    private User user;
    private ArrayList<User> users;

    // default constructor
    public Application() {
        this.user = null;
        this.users = null;
    }

    // setters
    public void setUser(User user) {
        this.user = user;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    // getters
    public User getUser() {
        return this.user;
    }

    public ArrayList<User> getUsers() {
        return this.users;
    }

    // public methods
    public ArrayList<User> readUsersFromFile(String path) {
        File file = new File(path);
        try {
            file.createNewFile();
        } catch (IOException ex) {
            System.out.println("IO Exception: " + ex.getStackTrace());
        }
        if (!file.exists()) {
            return null;
        }
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {

            String line = null;
            this.users = new ArrayList<User>();
            while ( (line = reader.readLine()) != null) {
                String[] strs = line.split("-");

                this.user = new User(strs[0], Integer.parseInt(strs[1]), strs[2]);
                //System.out.println(this.user);

                this.users.add(this.user);
            }
        } catch (IOException ex) {
            System.out.println("IO Exception: " + ex.getStackTrace());
        }
        return this.users;
    }
}
