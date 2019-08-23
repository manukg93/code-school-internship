package edu.codeschool.training.homework14;

import java.io.InputStreamReader;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String exitStr = "exit";

        System.out.println("Enter \"exit\" to terminate Calculator");

        double result = scanner.nextDouble();


        while (!scanner.hasNext(exitStr)) {

            char operation = scanner.next().charAt(0);

            double nextDouble = scanner.nextDouble();

                switch (operation) {
                    case '+':
                        result += nextDouble;
                        break;
                    case '-':
                        result -= nextDouble;
                        break;
                    case '*':
                        result *= nextDouble;
                        break;
                    case '/':
                        result /= nextDouble;
                        break;
                    default:
                        System.out.println("wrong operation");
                        operation = scanner.next().charAt(0);
                }
                System.out.println(result);
        }
    }
}
