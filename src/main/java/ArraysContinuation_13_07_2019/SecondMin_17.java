package ArraysContinuation_13_07_2019;

public class SecondMin_17 {
    public static void main(String[] args) {
        final int[] array = new int[]{4, 5, 7, 8, 3};
        int min1 = 4, min2 = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min1) {
                min2=min1;
                min1 = array[i];
            }
            else if (array[i]<min2) {
                min2=array[i];
            }
            }
        System.out.println(min2);
        }
    }
