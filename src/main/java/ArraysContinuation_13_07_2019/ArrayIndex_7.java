package ArraysContinuation_13_07_2019;

public class ArrayIndex_7 {
    public static void main(String[] args) {
        final int array[] = new int[] {1,25,8,6,4,5,56,55,8,68,45,62,66,82,63,33,3,7,71,32};
        int n = 71;
        int index;
        for (index = 0; index <= array.length; index++) {
            if (array[index] == n) {
                System.out.println("The number is " + (index));
                break;
            }
        }
    }
}
