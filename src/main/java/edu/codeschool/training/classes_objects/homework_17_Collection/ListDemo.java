package edu.codeschool.training.classes_objects.homework_17_Collection;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> strList=new ArrayList<>();
        strList.add("A");
        strList.add("B");
        strList.add("C");
        strList.add("D");
        strList.add("E");
        strList.add("F");
        strList.add("G");
        strList.add("H");
        strList.add("I");
        strList.add("J");



        System.out.println(strList);
        strList.remove(2);
        System.out.println("List elements after remove: ");
        Iterator iterator = strList.iterator();


        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println('\n'+"List elements printing with 'for each': ");
        for (String el:strList) {
            System.out.print(el+" ");
        }

    }
}
