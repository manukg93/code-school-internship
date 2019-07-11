package code.school.internship.arrays_and_loops;

//
public class OddSum1 {
    public static void main(String[] args) {
        final long N = 1_000_000;
        int n = 1;
        long sum = 0;

        do {
            sum += n;
            n += 2;
        } while (n < N);

        System.out.println("Sum of odd numbers from 1 to " + N + " is " + sum);


    }
}
