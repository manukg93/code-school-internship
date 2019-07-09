package code.school.internship;

public class Ex19ArrEquality {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5};
        int[] arr2 = {1, 2, 3, 5};

        if(arr1.length != arr2.length) {
            System.out.println("Arrays are not equal");
            return;
        }

        int i, j;
        boolean isEqual = false;
        for(i = 0, j = 0; i < arr1.length; i++, j++) {
            if(arr1[i] == arr2[j]) {
                isEqual = true;
            } else {
                isEqual = false;
            }
        }

        if (isEqual) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }

    }
}
