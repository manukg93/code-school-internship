package edu.codeschool.training.homework17.client;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Person{};

public class TestArrayList {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
//        List<Person> list = new edu.codeschool.training.homework17.exercise1.ArrayList<>();

//        List<String> listS = new ArrayList<>();
        List<String> listS = new edu.codeschool.training.homework17.exercise1.ArrayList<>();

        Person person1 = new Person();
        Person person2 = new Person();
        list.add(person1);
        list.add(person2);
        Person person = list.get(0);

        listS.add("AA");
        listS.add("BB");
        listS.add("DD");
        listS.add(0, "cc");
//        listS.set(0, "AB");
//        listS.remove(0);
        System.out.println(listS.get(0));
        System.out.println(listS.get(1));
        System.out.println(listS.get(2));

        System.out.println(listS.get(3));
        System.out.println(Arrays.toString(listS.toArray()));
//        System.out.println(listS.remove(0));
//        System.out.println(listS.set(1, "AC"));
        System.out.println(listS.indexOf("AA"));
        System.out.println(listS.indexOf("dsd"));

    }

}
