package ArraysContinuation_13_07_2019;

public class NumbersDevided3And7_15 {
    // Create a JAVA program to print the numbers that
    // divide to 3 from 10 to 100, both included, except the numbers that divide to 7.
    public static void main(String[] args) {
        int a=10;
        int b=100;
        for (int i=10; i<=100; i++){
            if (i%3==0&&i%7!=0) {
                System.out.println(i + ", ");
            }
        }
    }
}
