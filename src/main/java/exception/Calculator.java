package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println("a/b = " + (a/b) );
        } finally {
            System.out.println("Finally block");
        }
        System.out.println("Outside ");

    }
}
