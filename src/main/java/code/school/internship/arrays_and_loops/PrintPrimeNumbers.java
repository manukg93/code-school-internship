package code.school.internship.arrays_and_loops;

// Ex 26. Print all prime numbers between 1 to N
public class PrintPrimeNumbers {
    public static void main(String[] args) {
        final int N = 200;

        for(int i = 1; i <= N; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(i + " ");
            }
        }

    }
}
