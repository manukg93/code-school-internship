package code.school.internship.arrays_and_loops;

// Check if the given number is prime or not
public class Ex4PrimeNumber {
    public static void main(String[] args) {
        final long NUMBER = 3;

        for (int i = 2; i <= NUMBER/2; i++) {
            if (NUMBER % i == 0) {
                System.out.println(NUMBER + " is not prime!");
                return;
            }
        }

            System.out.println(NUMBER + " is prime");
    }
}
