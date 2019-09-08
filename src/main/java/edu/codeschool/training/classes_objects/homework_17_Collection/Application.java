package edu.codeschool.training.classes_objects.homework_17_Collection;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static ArrayList readUsersFromFile(String path) {
        ArrayList<User> users = new ArrayList<User>();
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while((line = bufferedReader.readLine()) != null) {
                User user=new User();
                String delimeter = "-"; // Разделитель
                String [] subStr = line.split(delimeter, 3);
                for(int i = 0; i < subStr.length; i++) {
                    user.setName(subStr[0]);
                    user.setAge(Integer.parseInt(subStr[1]));
                    user.setEmail(subStr[2]);
                }
                users.add(user);


            }

            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


        return users;
    }
}