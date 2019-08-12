package homework11.ex1;

import java.util.Scanner;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=input.nextInt();
        int b=input.nextInt();
        try {
            System.out.println(a/b);
        }
        catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }
}
