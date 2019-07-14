package ArraysContinuation_13_07_2019;

public class ArrayChars_13 {
    public static void main(String [] args)  {
        final char [] array = {'a','A','N','?','.','P','v','T','f','0','i','1','L','k','m','H'};
        for (int i=0; i< array.length; i++) {
            if (array[i] >= 65 && array[i]<= 90) {
                System.out.println("The uppercase elements are " + array[i]);
            }
        }
    }
}
