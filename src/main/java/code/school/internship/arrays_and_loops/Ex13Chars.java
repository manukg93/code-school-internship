package code.school.internship.arrays_and_loops;

public class Ex13Chars {
    public static void main(String[] args) {
        char[] letters = {'A', 'B', 'C', 'd', 'E'};
        int count = 0;

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] >= 65 && letters[i] <= 90) {
                count++;
            }
        }

        System.out.println("The number of uppercase letters is " + count);

    }
}
