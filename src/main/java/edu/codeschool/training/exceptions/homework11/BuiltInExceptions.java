package edu.codeschool.training.exceptions.homework11;

public class BuiltInExceptions {

    // this will cause an ArithmeticException
    public static int divideByZero(int a, int b) {

        int div = a / b;

        return div;
    }

    // this will cause NullPointerException and ArrayOutOfBoundsException
    public static int accessArrayElementAtIndex (int[] arr, int index) {

        int el = arr[index];

        return el;
    }

    public static int parseStringToInt(String number) {
        int n = Integer.parseInt(number);

        return n;
    }
}
