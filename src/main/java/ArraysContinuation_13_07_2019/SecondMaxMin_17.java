package ArraysContinuation_13_07_2019;

public class SecondMaxMin_17 {
    public static void main(String [] args) {
        final int[] array = new int[] {4,5,7,8,3};
        int max1=4, max2=0;
        for (int i=1; i < array.length; i++) {
            if (array[i]>max1) {
                max2=max1;
                max1=array[i];
            }
            else if (array[i]>max2) {
                max2 = array[i];
            }
            }
            System.out.println(max2);
    }
}
