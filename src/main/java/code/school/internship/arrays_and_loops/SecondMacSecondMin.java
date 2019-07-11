package code.school.internship.arrays_and_loops;

// Ex.17 Find the second largest and the second smallest elements in the array
public class SecondMacSecondMin {
    public static void main(String[] args) {
        int[] integers = {25, 2, 0, 8, 24, -9, 11};

        // Bubble sort
        for (int i = 0; i < integers.length; i++) {
            for (int j = 0; j < integers.length; j++) {
                if (integers[i] < integers[j]) {
                    int temp = integers[i];
                    integers[i] = integers[j];
                    integers[j] = temp;
                }
            }
        }

        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i] + " ");
        }

        System.out.println();
        System.out.println("The second largest element in array:" + integers[1]);
        System.out.println("The second smallest element in array:" + integers[integers.length-2]);

        /*
        int max = integers[0];
        int min = integers[0];
        int secondLargest = max;
        int secondSmallest = min;

        for (int i = 1; i < integers.length; i++) {
            if (max < integers[i]) {
                secondLargest = max;
                max = integers[i];
            }
            if (min > integers[i]) {
                secondSmallest = min;
                min = integers[i];
            }
        }

        System.out.println("The second largest element in the array: " + secondLargest);
        System.out.println("The second smallest element in the array: " + secondSmallest);

         */
    }
}
