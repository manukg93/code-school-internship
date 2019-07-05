package code.school.internship;

public class FloatingPointDemo {
    public static void main(String[] args) {
        float x = -0.89f;

        if (x == 0) {
            System.out.println("The number is zero!");
        } else if (x < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is positive");
        }

        if (Math.abs(x) < 1) {
            System.out.println("SMALL");
        } else if (Math.abs(x) > 1_000_000) {
            System.out.println("LARGE");
        }
    }
}
