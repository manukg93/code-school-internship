package code.school.internship;

//
public class Ex2Factorial {
    public static void main(String[] args) {
        final int N = 10;
        long factorial = 1;
        int n = 1;


        do {
            factorial *= n;
        } while (++n <= N);

        System.out.println("Factorial of the numbers from 1 to " + N + " is " + factorial);
    }
}
