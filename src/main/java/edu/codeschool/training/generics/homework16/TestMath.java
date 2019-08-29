package edu.codeschool.training.generics.homework16;

public class TestMath {
    public static void main(String[] args) {

        Math<Character> charObj = new Math<>();
        Character[] characters = {'a', 'A', 'u', 'V', '2', '9'};

        char minOfChars = charObj.min(characters);
        char maxOfChars = charObj.max(characters);

        System.out.println("min: " + minOfChars);
        System.out.println("max: " + maxOfChars);

        Math<Integer> intObj = new Math<>();
        Integer[] integers = {1, 12, 0, -4, 6, 20};

        int minOfIntegers = intObj.min(integers);
        int maxOfIntegers = intObj.max(integers);

        System.out.println("min: " + minOfIntegers);
        System.out.println("max: " + maxOfIntegers);

        // create Math object of strings
        Math<String> strObj = new Math<>();
        String[] strs = {"111", "abc", "aaa", "Abc", "acD"};

        String minStr = strObj.min(strs);
        String maxStr = strObj.max(strs);

        System.out.println("min: " + minStr);
        System.out.println("max:" + maxStr);

        // reverse integers' array
        intObj.reverse(integers);
        for (Integer el : integers ) {

            System.out.print(el + ",");

        }
        System.out.println();

        // reverse array of strings
        strObj.reverse(strs);
        for ( String s : strs ) {

            System.out.print(s + ",");

        }
        System.out.println();

        // search
        System.out.println("array contains 0: " + intObj.search(integers, 0));
    }
}
