package homework17.ex3;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class App   {
    static void readUsersFromFile(String path)throws IOException {
        ArrayList<User> users = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\LENOVO\\Desktop\\users.txt"));
        String line = bufferedReader.readLine();
        while (line!=null){
           // System.out.println(line);
            users.add(new User(line));
            line=bufferedReader.readLine();
        }
        bufferedReader.close();

    }

}
