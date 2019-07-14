package ArraysContinuation_13_07_2019;

public class CummonElements_16 {
    public static void main(String[] args) {
        final int array[] = new int [] {1,2,3,4};
        final int array1[] = new int [] {3,4,5,6};
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array1.length; j++) {
                if (array[i] == array1[j]) {
                    System.out.println(array[i] + ", ");
                }
            }
        }
    }
}
