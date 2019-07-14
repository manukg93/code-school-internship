package ArraysContinuation_13_07_2019;

public class ArrayElementMissing_20 {
    public static void main(String[] args) {
        final int[] array = new int[]{1, 2, 3, 4, 6, 7, 8, 9};
        for (int i = 0; i < array.length; i++) {
            if (array[i] != i+1) {
                System.out.println("The missing element is " + (i+1));
                break;
            }
        }
    }
}
