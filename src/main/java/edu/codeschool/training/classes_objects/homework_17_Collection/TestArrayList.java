package edu.codeschool.training.classes_objects.homework_17_Collection;

import java.util.Arrays;
import java.util.Iterator;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> str=new ArrayList<>();
        str.add("A");
        str.add("B");
        str.add("C");
        str.add("D");
        str.add("E");
        Iterator iter=str.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        System.out.println(str.size());
    }
}
