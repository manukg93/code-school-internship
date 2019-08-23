package edu.codeschool.training.homework14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter \"exit\" to terminate Calculator");

        double result = 0;
        char operation = 0;

        if (scanner.hasNext("exit"))
            return;

        try {

            result = scanner.nextDouble();

        } catch (InputMismatchException ex) {

            System.out.println("expected double or integer");
        }

        while (!scanner.hasNext("exit")) {

            try {

                operation = scanner.next().charAt(0);

            } catch (InputMismatchException ex) {

                System.out.println("expected arithmetic operation");
            }

            double nextDouble = 0;

            try {

                nextDouble = scanner.nextDouble();

            } catch (InputMismatchException ex) {

                System.out.println("Expected double or integer");
            }

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
                    break;
                }

            System.out.println(result);
            }
        }
    }
