package edu.codeschool.training.homework17_;

import java.util.Arrays;
import java.util.Random;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("A");
        Random rand = new Random();
        int rand_int1 = rand.nextInt(10);
            System.out.println(rand_int1);
        arrayList.add("C");
        arrayList.contains("C");
        System.out.println((arrayList));
        System.out.println(arrayList.contains("C"));
    }
}
