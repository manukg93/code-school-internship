package ArraysContinuation_13_07_2019;

public class ArrayRevers_11 {
    public static void main(String[] args) {
        //Given the array = {1,2,3,4,5,6}.Write a Java program to reverse the array of int values
        // ex. {1,2,3,4,5,6} -> {6,5,4,3,2,1}
        final int array[] = new int[] {1,2,3,4,5,6};
        final int revers[] = new int[array.length];
        for (int i=0; i<array.length; i++) {
            revers[i]=array[array.length-1-i];
        }
        for (int i=0; i<revers.length; i++){
            System.out.println(revers[i]);
        }
    }
}
