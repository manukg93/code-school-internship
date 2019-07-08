package code.school.internship;

public class Ex3Pow {
    public static void main(String[] args) {
        final int N = 3;
        final int M = 3;
        long pow = 1;

        for (int i = 1; i <= N; i++) {
            pow = pow * M;
        }

        System.out.println("m in degrees n is " + pow);
    }
}
