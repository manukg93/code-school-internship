package code.school.internship.arrays_and_loops;

// Ex.24 Find count of digits in a number
public class CountOfDigits {
    public static void main(String[] args) {
        final int NUMBER = 12378;

        int countOfDigits = 0;
        int num = NUMBER;
        int digit;

        while (num >= 1) {
            digit = num % 10;
            num /= 10;
            countOfDigits++;
        }

        System.out.println("Count of digits in " + NUMBER + " is " + countOfDigits);
    }
}
