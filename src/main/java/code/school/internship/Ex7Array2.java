package code.school.internship;

public class Ex7Array2 {
    public static void main(String[] args) {
        int[] arrayOfInts = {1, 25, 8, 6, 4, 5, 12, 55, 8, 68, 45, 23, 66, 82, 63};
        final int N = 19; // Check the array contains this value or not
        boolean contains = false;

        for (int i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == N) {
                contains = true;
                System.out.println("The index of " + N + " is " + i);
            }
        }

        if(!contains) {
            System.out.println("The array does not contain the value " + N);
        }
    }
}
