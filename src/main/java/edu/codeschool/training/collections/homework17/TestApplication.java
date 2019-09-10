package edu.codeschool.training.collections.homework17;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class TestApplication {
    public static void main(String[] args) {
        //System.out.println(System.getProperty("user.dir"));
        String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "main" + File.separator
                + "java" + File.separator + "resources" + File.separator + "users.txt";

        Application application = new Application();
        ArrayList<User> users = application.readUsersFromFile(path);
//        for ( User user : users ) {
//            System.out.println(user);
//        }

        // sort users arrayList by age
        Collections.sort(users, new SortByAge());
//        for ( User user : users ) {
//            System.out.println(user);
//        }
//        System.out.println();

        // print users whose age > 18 and < 40
        for ( User user : users ) {
            if (user.getAge() > 18 && user.getAge() < 40) {
                System.out.println(user);
            }
        }
        System.out.println();

        // sort users arrayList by age
        Collections.sort(users, new SortByName());
        for ( User user : users ) {
            System.out.println(user);
        }
        System.out.println();
    }
}
