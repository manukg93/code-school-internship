package edu.codeschool.training.exceptions.homework11.client;

import edu.codeschool.training.exceptions.homework11.BuiltInExceptions;

public class BuiltInExceptions_Demo {

    public static void main(String[] args) {

        //int a = 10;
        //int b = 0;
        //int c = divideByZero(a, b);
//
        //System.out.println("Result is " + c);

        int[] arr = {1, 2, 3, 4, 5};
        //int el = accessArrayElementAtIndex(arr, 6);
        //System.out.println(el);
        arr = null;

        //int e = accessArrayElementAtIndex(arr, 0);
        //System.out.println(e);

        //int x = parseStringToInt("1aa2");
        //System.out.println(x);

        Object obj = new Integer(10);
        System.out.println((String) obj);

    }
}

