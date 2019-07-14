package ArraysContinuation_13_07_2019;

public class ArrayBoolean_18 {
    public static void main(String[] args) {
        final boolean[] array = new boolean[] {true, false, false, false, true, false};
        int suma=0;
        int sumb=0;
        for (int i=0; i<array.length; i++) {
            if (array[i]) {
              suma++;
            }
            else {
                sumb++;
            }
        }
        System.out.println(suma);
        System.out.println(sumb);
    }
}
