package code.school.internship;

// Check if the given number is prime or not
public class Ex4PrimeNumber {
    public static void main(String[] args) {
        final long NUMBER = 1_895_627;
        boolean isPrime = true;

        for (int i = 2; i <= NUMBER/2; i++) {
            if (NUMBER % i == 0) {
                isPrime = false;
            }
            break;
        }

        if (isPrime) {
            System.out.println("Number " + NUMBER + " is prime");
        } else {
            System.out.println("Number " + NUMBER + " is not prime");
        }
    }
}
