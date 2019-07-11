package code.school.internship.arrays_and_loops;

// Ex.25 Check whether a number is palindrome or not
public class PalindromicNumber {
    public static void main(String[] args) {
        final int NUMBER = 123321;

        // split the number into digits
        int countOfDigits = 0;
        int num = NUMBER;
        int digit;

        while(num >= 1) {
            digit = num % 10;
            num = num / 10;
            countOfDigits++;
        }

        // declare an array for digits
        int[] digits = new int[countOfDigits];

        int number = NUMBER;
        while(number >= 1) {
            digit = number % 10;
            number = number / 10;
            digits[countOfDigits - 1] = digit;
            countOfDigits--;
        }

        for (int i= 0; i < digits.length; i++) {
            System.out.print(digits[i] + " ");
        }
        System.out.println();


        // Check if the number is palindrome or not
        for(int i = 0; i < digits.length; i++) {
            if (digits[i] != digits[digits.length-1 - i]) {
                System.out.println(NUMBER + " number is not palindrome.");
                return;
            }
        }

        System.out.println(NUMBER + " number is palindrome");

    }
}
