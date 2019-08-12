package Homework11;

import java.util.Random;

public class ExampleHandlError {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Random r = new Random();
        for(int i = 0; i < 15; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            }
            catch (java.lang.ArithmeticException e) {
                System.out.println("Arithmetic exception");
                a = 0;
            }
            System.out.println("a: " + a);
            }
            }
        }

