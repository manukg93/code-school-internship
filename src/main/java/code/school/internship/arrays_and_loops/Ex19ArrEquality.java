package code.school.internship.arrays_and_loops;

public class Ex19ArrEquality {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5, 78};
        int[] arr2 = {1, 2, 3, 5, 78};

        if(arr1.length != arr2.length) {
            System.out.println("Arrays are not equal");
            return;
        }

        int i, j;
        boolean isEqual = false;
        for(i = 0, j = 0; i < arr1.length; i++, j++) {
            if(arr1[i] != arr2[j]) {
                System.out.println("Arrays are not equal!!!");
                return;
            }
        }

        System.out.println("Arrays are equal!!!");

    }
}
