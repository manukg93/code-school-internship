package edu.codeschool.training.classes_objects.homework_14;

import java.io.Console;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) throws InputMismatchException{

        Scanner Calc = new Scanner(System.in);
        double result;
        String outOfCalc = "Exit";
        String zero = "0";

        System.out.println("Enter the numbers to calculate or keyword 'Exit' to exit program");

        while (!Calc.hasNext(outOfCalc)) {
            try {
                double n1 = Calc.nextDouble();
                System.out.println("Enter the second number:");
                double n2 = Calc.nextDouble();
                System.out.println("Select the arithmetic operation: '+','-','*','/' ");
                char operator = Calc.next().charAt(0);
                if (operator == '+') {
                    result = n1 + n2;
                    System.out.println("Answer: " + result);
                }
                if (operator == '-') {
                    result = n1 - n2;
                    System.out.println("Answer: " + result);
                }
                if (operator == '*') {
                    result = n1 * n2;
                    System.out.println("Answer: " + result);
                }
                if (operator == '/' && n2 == 0) {
                    System.out.println("Dont divide by ZERO");
                    System.out.println("Enter the second number which is not equal to zero");
                    double n3 = Calc.nextDouble();
                    System.out.println("Answer: " + n1 / n3);
                } else {
                    result = n1 / n2;
                    System.out.println("Answer: " + result);
                }
            }catch (InputMismatchException ex){
                System.out.println("Enter the numbers to calculate or keyword 'Exit' to exit program");
                Calc.reset();

            }
            }
        }
    }
