package edu.codeschool.training.collections.homework17;

import java.io.File;
import java.util.ArrayList;

public class TestApplication {
    public static void main(String[] args) {
        //System.out.println(System.getProperty("user.dir"));
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator
                + "java" + File.separator + "resources" + File.separator + "users.txt";

        Application application = new Application();
        ArrayList<User> users = application.readUsersFromFile(path);
        for ( User user : users ) {
            System.out.println(user);
        }

    }
}
