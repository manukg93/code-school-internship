package homework17.ex3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
       // System.out.println(App.readUsersFromFile("C:\\Users\\LENOVO\\Desktop\\users.txt"));
        String path = "C:\\Users\\LENOVO\\Desktop\\users.txt";
        ArrayList<User> userArrayList = App.readUsersFromFile(path);
    /*    for(User user1:userArrayList){
            if(user1.getAge()>18 && user1.getAge()<40){
                System.out.println(user1);
            }
        }*/

        //Collections.sort(userArrayList,new AgeSort());
        Collections.sort(userArrayList,new NameSort());

        for(User user:userArrayList){
            System.out.println(user);
        }



    }
}
