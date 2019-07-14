package ArraysContinuation_13_07_2019;

public class ArrayAverageMinMax_21 {
    public static void main(String[] args) {
        final int[] array = new int[]{4, 5, 7, 8, 3};
        int max = array[0], min = array[0];
        double sum=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            }
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double avr = (sum - min - max) / (array.length-2);
        System.out.println("The max element is " + max);
        System.out.println("The min element is " + min);
        System.out.println(avr);
    }
}
