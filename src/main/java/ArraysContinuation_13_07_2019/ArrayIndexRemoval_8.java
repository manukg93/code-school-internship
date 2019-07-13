package ArraysContinuation_13_07_2019;

public class ArrayIndexRemoval_8 {
    public static void main(String[] args) {
        final int[] array = new int[] {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int x = 29;
        int index;
        for (index = 0; index <= array.length; index ++) {
            if (array[index]==x) {
                System.out.println("The removal number is " + (x) + " = " + (index));
                break;
            }
            int removeindex=index;
            for (removeindex=index; removeindex< array.length-1; removeindex++) {
               array[index] = array[removeindex+1];
               if(true) {
                   System.out.print((array[removeindex + 1])+ ", ");
               }
               break;
            }
        }
    }
}
