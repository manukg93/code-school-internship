package edu.codeschool.training.homework17.exercise4;

import edu.codeschool.training.homework17.exercise1.ArrayList;
//import java.util.ArrayList;

import java.util.Iterator;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        for(int i = 0; i< 10; i++){
            arrayList.add("Simple_text_"+i);
        }

        Iterator<String> i = arrayList.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println();

        arrayList.remove(3);
//        arrayList.remove("Simple_text_2");

        Iterator<String> new_i = arrayList.iterator();
        while(new_i.hasNext()){
            System.out.println(new_i.next());
        }
    }
}
