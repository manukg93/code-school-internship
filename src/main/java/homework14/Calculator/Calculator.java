package homework14.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Start or Exit?");
            String start = input.next();
            if (start.equals("exit")) {
                System.exit(0);
            }
            try {
                System.out.print("first int=");
                int firstInt = input.nextInt();
                System.out.print("second int=");
                int secondInt = input.nextInt();
                System.out.print("input operator` + , - , * , /");
                char operator = input.next().charAt(0);


                try {

                    if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                        if (operator == '+') {
                            System.out.println(firstInt + secondInt);
                        } else if (operator == '-') {
                            System.out.println(firstInt - secondInt);
                        } else if (operator == '*') {
                            System.out.println(firstInt * secondInt);
                        } else if (operator == '/') {
                            try {
                                if (secondInt != 0) {
                                    System.out.println(firstInt / secondInt);
                                } else {
                                    throw new ArithmeticException("/ by zero");
                                }
                            } catch (ArithmeticException ex) {
                                System.out.println(ex);
                                continue;
                            }
                        }

                    } else {
                        throw new IllegalOperatorException("Operator is illegal");
                    }
                } catch (IllegalOperatorException ex) {
                    System.out.println(ex);
                    continue;
                }
            } catch (InputMismatchException ex) {
                System.out.println(ex);
                continue;
            }
        }


    }
}
