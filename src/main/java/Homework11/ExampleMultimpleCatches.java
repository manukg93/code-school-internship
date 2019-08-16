package Homework11;

public class ExampleMultimpleCatches {
    public static void main(String args[]) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 45 / a;
            int c [] = {1};
            c[42] = 99;
        } catch (java.lang.ArithmeticException e) {
            System.out.println(" deviding on zero " + e);
            System.out.println( " Error " + e);
        }
        System.out.println("After try / catch operators' bloc ");
    }
}
