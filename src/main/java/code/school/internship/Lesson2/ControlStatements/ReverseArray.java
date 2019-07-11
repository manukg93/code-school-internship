package code.school.internship.Lesson2.ControlStatements;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] reverseArray = new int[array.length];

        System.out.println(array.length);
        System.out.println(reverseArray.length);

        System.out.print("Array: ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        /*
        // using while loop
        int i = array.length - 1;
        int j = 0;

        while(i >= 0) {
            reverseArray[j] = array[i];
            i--;
            j++;
        }

         */

        // using for loop
        int i, j; // indexes

        for (i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverseArray[j] = array[i];
        }

        System.out.print("Reverse Array:");
        for (int k = 0; k < reverseArray.length; k++) {
            System.out.print(reverseArray[k] + " ");
        }

    }
}
