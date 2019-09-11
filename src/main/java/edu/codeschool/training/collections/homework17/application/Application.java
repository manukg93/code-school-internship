package edu.codeschool.training.collections.homework17.application;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public ArrayList<User> readUsersFromFile(String path) throws NumberFormatException {
        File file = new File(path);
        List<User> users = null;

        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {

            String line = null;
            users = new ArrayList<User>();
            while ( (line = reader.readLine()) != null) {
                String[] strs = line.split("-", 3);

                User user = new User(strs[0], Integer.parseInt(strs[1]), strs[2]);
                users.add(user);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File users.txt is not found." + ex.getStackTrace());
        } catch (IOException ex) {
            System.out.println("Input/Output error: " + ex.getStackTrace());
        } catch (NumberFormatException ex) {
            System.out.println("parseInt(): Number Format Exception" + ex.getCause());
        }
        return (ArrayList<User>) users;
    }
}
