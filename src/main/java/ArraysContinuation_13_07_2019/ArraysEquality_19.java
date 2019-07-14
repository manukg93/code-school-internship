package ArraysContinuation_13_07_2019;

import java.util.Arrays;

public class ArraysEquality_19 {
    public static void main(String[] args) {
        final int[] array = new int[]{1, 2};
        final int[] array1 = new int[]{1, 2};
        if (Arrays.equals(array, array1))
        System.out.println("The arrays are equal");
        else
            System.out.println("The arrays aren't eqaul");
    }
}
