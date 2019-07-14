package ArraysContinuation_13_07_2019;

public class ArrayDuplicate_12 {
    public static void main(String[] args) {
        final int[] array = new int[]{1, 2, 5, 5, 6, 6, 7, 2};
        for (int i = 0; i < array.length; i++) {
            if (array[i++]==array[i]);
            System.out.println("The " + array[i] + " is a duplication.");
        }
    }
}
