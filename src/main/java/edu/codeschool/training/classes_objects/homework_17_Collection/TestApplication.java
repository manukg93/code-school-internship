package edu.codeschool.training.classes_objects.homework_17_Collection;

import java.io.File;
import java.util.*;
import java.util.ArrayList;

public class TestApplication {
    public static void main(String[] args) {
        String path= File.separator+"Users"+File.separator+"haykserobyan"+File.separator+"Desktop"+File.separator+"users.txt";
        User user=new User();
        ArrayList<User> userList=Application.readUsersFromFile(path);
        userList.add(user);
        System.out.println(Application.readUsersFromFile(path));


        Collections.sort(userList,new UserAgeComparator());
        Iterator<User> iterator=userList.iterator();
        while(iterator.hasNext()){
            if(iterator.next().getAge()>18 && iterator.next().getAge()<40)
            System.out.println(iterator.next());
        }
    }
}
