package code.school.internship.arrays_and_loops;

public class Ex7Array2 {
    public static void main(String[] args) {
        int[] arrayOfInts = {1, 25, 8, 6, 4, 5, 12, 55, 8, 68, 45, 23, 66, 82, 63};
        final int N = 55; // Check the array contains this value or not

        for (int i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == N) {
                System.out.println("The index of " + N + " is " + i);
                return;
            }
        }

            System.out.println("The array does not contain the value " + N);
    }
}