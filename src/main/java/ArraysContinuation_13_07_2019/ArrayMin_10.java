package ArraysContinuation_13_07_2019;

public class ArrayMin_10 {
    public static void main(String[] args) {
        final int array[] = new int[] {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int min=array[0];
        for (int i=1; i<array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            System.out.println("The array's elements are");
        }
            for (int i=0; i<array.length; i++) {
                System.out.println(array[i]);
            }
            System.out.println("The min value of array is " + min);
        }
    }
