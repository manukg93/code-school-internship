package code.school.internship.arrays_and_loops;

public class Ex5Series {
    public static void main(String[] args) {
        final int N = 3;
        double sum = 1;

        for (int i = 2; i <= N; i++) {
            sum += (double) 1/i;

        }
        System.out.println(sum);
    }
}
