package edu.codeschool.training.homework19;

import java.util.Map;

public class TestCustomHashMap {
    public static void main(String[] args) {

        Map<String, Integer> myMap = new CustomHashMap<>();
        for (int i = 0; i < 20; i++) {
            myMap.put("a" + i, i);
        }
        System.out.println(myMap.size());
        System.out.println(myMap.containsKey("a10"));
        System.out.println(myMap.isEmpty());
        System.out.println(myMap.containsValue(100));
        Integer v1 = myMap.get("a22");
        Integer v2 = myMap.get("a12");
        System.out.println(v1);
        System.out.println(v2);
        //System.out.println(myMap);
    }
}
