package ArraysContinuation_13_07_2019;

public class ArrayComy_9 {
    public static void main(String args[]) {
        int array [] = new int [] {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        int newarray []= new int [array.length];
        for (int i=0; i< array.length; i++) {
            newarray[i]=array[i];
        }
        for (int i=0; i< newarray.length; i++) {
            System.out.print((newarray[i]) + ", ");
        }
    }
}
