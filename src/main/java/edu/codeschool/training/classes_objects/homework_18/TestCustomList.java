package edu.codeschool.training.classes_objects.homework_18;

import java.util.Arrays;

public class TestCustomList {
    public static void main(String[] args) {
        CustomList<String> str = new CustomList<>();
        str.add("A");
        str.add("B");
        str.add("C");
        str.add("J");
        str.add("E");
        str.add("F");
        str.add("G");
        str.add("H");
        str.add("I");
        str.add("J");
        str.add("K");
        str.add("L");
        str.add("M");
        str.add("N");
        System.out.println("get: "+str.get(5));
        System.out.println("contains 'G': "+str.contains("G"));
        System.out.println("contains 'Z': "+str.contains("Z"));
        System.out.println("size: "+str.size());
        System.out.println("index of 'C' : "+str.indexOf("C"));
        System.out.println("index of 'Z' : "+str.indexOf("Z"));




    }
}