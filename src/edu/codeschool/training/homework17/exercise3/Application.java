package edu.codeschool.training.homework17.exercise3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Application {

    public static List readUsersFromFile(String path){
        ArrayList<User> users = new ArrayList<>();

        BufferedReader br = null;

        try (InputStream is = new FileInputStream(path)){

            br = new BufferedReader(new InputStreamReader(is));

            String line = null;

            while ((line = br.readLine()) != null) {

                String delimeter = "-";
                String [] subStr = line.split(delimeter, 3);
                User user = new User();
                user.setName(subStr[0]);
                user.setAge(Integer.parseInt(subStr[1]));
                user.setEmail(subStr[2]);

                users.add(user);

            }

        }
        catch (IOException ioe) {
            System.out.println("Exception while reading input " + ioe);
        }


        return users;

    }
}
