package edu.codeschool.training.recursion;

class PowerOfTwo {

    private static boolean isPowerOfTwo(int n) {
        if (n < 0) {
            System.out.println("n must be > 0");
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 2 == 0) {
            return isPowerOfTwo(n / 2);
        }
        return false;
    }

    public static void main(String[] args) {
        if (isPowerOfTwo(-16)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
