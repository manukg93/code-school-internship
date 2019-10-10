package edu.codeschool.training.recursion;

class FibonacciSequence {

    private static int fibonacciNumber(int n) {
        if (n < 0) {
            System.out.println("n must be non negative");
            return 0;
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
         return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
    }

    private static void printFibonacciNumbers(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciNumber(i) + "\t");
        }
    }

    public static void main(String[] args) {
        printFibonacciNumbers(10);
    }
}
