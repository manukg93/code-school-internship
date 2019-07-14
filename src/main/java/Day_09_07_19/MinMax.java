package Day_09_07_19;

public class MinMax {
    public static void main(String[] args) {
        final int[] array = new int[]{1, 25, 35, 57, 4};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }
}
