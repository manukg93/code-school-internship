package ArraysContinuation_13_07_2019;

public class DijitsCount_24 {
    public static void main(String[] args) {
        //String number = "1546987";
       // String[] array = number.split(" ");
        //int[] array1 = new int [array.length];
        //for (int i=0; i < array1.length; i++) {
        //  System.out.println(array1[i]);
      //  }
   // }
        int count = 0;
        int number = 1546987;
        while (number != 0) {
        number = number / 10;
        count++;
        }
        System.out.println("The count of the digits ia " + count);
    }
}
