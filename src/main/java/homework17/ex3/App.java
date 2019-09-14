package homework17.ex3;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;

public class App {
    static ArrayList<User> readUsersFromFile(String path) {
        ArrayList<User> users = new ArrayList<>();
        File file = new File(path);
        String line;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            while ((line = bufferedReader.readLine()) != null) {
                User user = new User();
                String a = "-";
                String[] array = line.split(a, 3);
                for (int i = 0; i < array.length; i++) {
                    user.setName(array[0]);
                    user.setAge(Integer.parseInt(array[1]));
                    user.setEmail(array[2]);
                }
                users.add(user);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }



        return users;
        }
    }



