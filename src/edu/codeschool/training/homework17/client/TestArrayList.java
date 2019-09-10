package edu.codeschool.training.homework17.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Person{};

public class TestArrayList {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
//        List<Person> list = new edu.codeschool.training.homework17.exercise1.ArrayList<>();

        List<String> listS = new ArrayList<>();
//        List<String> listS = new edu.codeschool.training.homework17.exercise1.ArrayList<>();

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
//        System.out.println(listS.get(0));
//        System.out.println(listS.get(1));
//        System.out.println(listS.get(2));
//        System.out.println(listS.get(3));
//        System.out.println(listS.remove(0));
//        System.out.println(listS.set(1, "AC"));
        for(int i = 0; i< 30; i++){
            listS.add("DD"+i);
        }
//        while(listS.iterator().hasNext())
            System.out.println(listS.iterator().next());
            System.out.println(listS.iterator().next());
            System.out.println(listS.iterator().next());
//        listS.iterator().remove();
//        System.out.println(listS.iterator().next());
//        System.out.println(listS.iterator().next());
//        System.out.println(listS.iterator().next());
        Iterator i = listS.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
//        System.out.println(listS.indexOf("AA"));
//        System.out.println(listS.indexOf("dsd"));
//        System.out.println(listS.toString());

//        System.out.println(listS.iterator().hasNext());
//        listS.iterator().remove();
//        System.out.println(listS.iterator().next());
    }

}
