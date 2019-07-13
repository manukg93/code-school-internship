package ArraysContinuation_13_07_2019;

public class ArrayMinMax_10 {
    public static void main(String[] args){
        final int array[] = new int[] {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int max=array[0];
        for (int i=1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
            System.out.println("The elements are ");
            for (int i=0; i<array.length; i++) {
                System.out.println(array[i]);
            }
            System.out.println("The max value is " + max);
    }
}
