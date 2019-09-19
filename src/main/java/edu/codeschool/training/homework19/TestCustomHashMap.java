package edu.codeschool.training.homework19;

import java.util.HashMap;
import java.util.Map;

public class TestCustomHashMap {
    public static void main(String[] args) {

        Map<String, Integer> myMap = new CustomHashMap<>();
        for (int i = 0; i < 5; i++) {
            myMap.put("a" + i, i);
        }
        System.out.println(myMap);
        myMap.clear();
        System.out.println(myMap);
        System.out.println(myMap.size());
        myMap.put("aaa", 2);
        System.out.println(myMap);

//        Map<String, Integer> myMap2 = new HashMap<>();
//        myMap2.put("name1", 22);
//        myMap2.put("name2", 32);
//        myMap2.put("name3", 42);
//        myMap2.put("name4", 52);
//        System.out.println(myMap2);
//
//        // test putAll() method
//        myMap.putAll(myMap2);
//        System.out.println(myMap);
//        myMap.clear();
//        System.out.println(myMap);
    }
}
