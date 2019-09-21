package edu.codeschool.training.homework17.client;

import java.util.List;
import java.util.LinkedList;
//import edu.codeschool.training.homework17.exercise2.LinkedList;


public class TestLinkedList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();

        list.add("AA");
        list.add("BB");
        list.add("DD");
//        list.remove("BB");
            String s = list.get(1);
        System.out.println(s);
        System.out.println(list);
        System.out.println(list.get(list.size() -  1));


//
//
//        String str1 = new String("Hello World!");
//        String str2 = new String("My name is Earl");
//        String str3 = new String("I love Java");
//        String str4 = new String("I live in Moscow");
//
//        LinkedList<String> earlBio = new LinkedList<>();
//        earlBio.add(str1);
//        earlBio.add(str2);
//        earlBio.add(str3);
//        earlBio.add(str4);
//
//        System.out.println(earlBio);

    }
}
