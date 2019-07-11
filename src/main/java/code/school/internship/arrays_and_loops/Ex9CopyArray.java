package code.school.internship.arrays_and_loops;

//
public class Ex9CopyArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] copyNumbers = new int[numbers.length];

        for(int i = 0; i < numbers.length; i++) {
            copyNumbers[i] = numbers[i];
        }

        System.out.print("Copied array: ");
        for(int i = 0; i < copyNumbers.length; i++) {
            System.out.print(copyNumbers[i] + " ");
        }
        System.out.println();
    }
}
