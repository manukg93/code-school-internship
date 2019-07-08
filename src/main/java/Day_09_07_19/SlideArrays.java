package Day_09_07_19;

public class SlideArrays {
    public static void main(String[] args) {
        final int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
