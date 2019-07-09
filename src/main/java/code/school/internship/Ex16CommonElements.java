package code.school.internship;

public class Ex16CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {3, 3, 4, 5, 6};
        int[] commonElements;

        if (arr1.length > arr2.length) {
            commonElements = new int[arr1.length ];
        } else {
            commonElements = new int[arr2.length ];
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j] == arr1[i]) {
                    commonElements[i] = arr1[i];
                }
            }
        }

        System.out.println("Common elements of two arrays are");
        for (int i = 0; i < commonElements.length; i++) {
            System.out.print(commonElements[i] + " ");
        }

        System.out.println();
    }
}
