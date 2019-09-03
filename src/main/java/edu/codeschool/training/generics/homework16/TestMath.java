package edu.codeschool.training.generics.homework16;

import java.util.Arrays;

public class TestMath {
    public static void main(String[] args) {

        Character[] characters = {'a', 'A', 'u', 'V', '2', '9'};
        // pass array of characters
        Character minOfChars = Math.min(characters);
        Character maxOfChars = Math.max(characters);

        System.out.println("min: " + minOfChars);
        System.out.println("max: " + maxOfChars);

        Integer[] integers = new Integer[]{1, 12, 0, -4, 6, 20};
        // pass array of integers
        Integer minOfIntegers = Math.min(integers);
        Integer maxOfIntegers = Math.max(integers);

        System.out.println("min: " + minOfIntegers);
        System.out.println("max: " + maxOfIntegers);

        String[] strs = {"111", "abc", "aaa", "Abc", "acD"};

        // pass array of Strings
        String minStr = Math.min(strs);
        String maxStr = Math.max(strs);

        System.out.println("min: " + minStr);
        System.out.println("max:" + maxStr);

        // reverse integers' array
        Math.reverse(integers);
        for (Integer el : integers ) {
            System.out.print(el + ",");
        }
        System.out.println();

        // reverse array of strings
        Math.reverse(strs);
        for ( String s : strs ) {
            System.out.print(s + ",");
        }
        System.out.println();

        // search
        System.out.println("array contains 0: " + Math.search(integers, 0));

        // get subArray of strs
        Comparable[] sub = Math.subArray(strs, 1, 3);
        for (Comparable st : sub ) {
            System.out.print(st + ",");
        }
        System.out.println();


        Comparable[] subInt = Math.subArray(integers, 1, 4);
        for (Comparable i : subInt ) {
            System.out.print(i + ",");
        }
        System.out.println();
    }
}
