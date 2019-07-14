package ArraysContinuation_13_07_2019;

public class OddEvennumbers_14 {
    public static void main(String [] args) {
        int a=13;
        int b=50;
        System.out.println("The even numbers are ");
        for (int i=a; i<b; i++) {
            if (i%2==0) {
                System.out.println(i + ", ");
            }
            }
       System.out.println("The odd numbers are ");
        for (int i=a; i<b; i++) {
            if (i%2==1) {
                System.out.println(i + ", ");
            }
        }
    }
}
