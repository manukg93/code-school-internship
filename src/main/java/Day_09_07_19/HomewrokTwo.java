package Day_09_07_19;

public class HomewrokTwo {
    public static void main(String[] args) {
        // Write a program to print the factorial value of the given N(N = 100).
       long factorial=1;
       long x = 5;
       for (long i=x; i>0; i--) {
           factorial=factorial*i;
       }
        System.out.println("Factorial of " + (x) + " is: " + (factorial));
    }
}