package edu.codeschool.training.recursion;

class Numbers {

    private static void printNumbers(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }

        if (n > 1) {
            printNumbers(n - 1);
            System.out.println(n);
            return;
        }

        System.out.println("n must be greater than 0");
    }

    public static void main(String[] args) {
        printNumbers(10);
    }
}
