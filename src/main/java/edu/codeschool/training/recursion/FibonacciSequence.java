package edu.codeschool.training.recursion;

public class FibonacciSequence {
    private int[] array = new int[20];

    // default constructor
    private FibonacciSequence() {
        this.array[0] = 0;
        this.array[1] = 1;
    }

    private int fibonacciNumbers(int n) {
        if (n == 1) {
            int next = 1;
            this.array[n + 1] = next;
            return next;
        }
        if (n == 2) {
            int next = 2;
            this.array[n + 1] = next;
            return next;
        }
        if (n > 2) {
            int next = fibonacciNumbers(n - 1) + fibonacciNumbers(n - 2);
            this.array[n + 1] = next;
            return next;
        }
        return 0;
    }

    private void printSequence() {
        for ( int el : this.array ) {
            System.out.print(el + "\t");
        }
    }

    public static void main(String[] args) {
        FibonacciSequence seq = new FibonacciSequence();
        System.out.println(seq.fibonacciNumbers(5));
        seq.printSequence();
    }
}
