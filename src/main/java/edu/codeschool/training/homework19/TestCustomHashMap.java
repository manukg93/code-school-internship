package edu.codeschool.training.homework19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestCustomHashMap {
    public static void main(String[] args) {

        Map<String, Integer> myMap = new CustomHashMap<>();
        myMap.put("name1", 22);
        myMap.put("name2", 32);
        myMap.put("name3", 42);
        myMap.put("name4", 52);
        System.out.println("my map: " + myMap);

        // test keySet() method
        Set<String> keys = myMap.keySet();
        System.out.println("keys: " + keys);

        // test values() method
        Collection<Integer> values = myMap.values();
        System.out.println("values: " + values);

        // test entrySet() method
        Set<Map.Entry<String, Integer>> entries = myMap.entrySet();
        System.out.println("entries of map: " + entries);

    }
}
