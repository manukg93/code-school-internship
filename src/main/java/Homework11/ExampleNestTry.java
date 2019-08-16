package Homework11;

public class ExampleNestTry {
    public static void main(String args[]) throws ArithmeticException {
        int a = args.length;
        int b = 42 / a;
        System.out.println(" a = " + a);
        try {
            if (a == 1) a = a / (a - a);
            if (a == 2) {
                int c[] = {1};
                c[42] = 99;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bound of array " + e);
        }
    }
        }
