package edu.codeschool.training.classes_objects.homework4.homework14;



import  java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            boolean calc=true;

        while (calc) {

            System.out.println("first integer number");
            int a = scanner.nextInt();
            System.out.println("second integer number");
            int b = scanner.nextInt();
            System.out.println("input operations \"+\" , \"-\", \"/\" \"*\"");

            char op = scanner.next().charAt(0);
            switch (op) {
                case '+':

                    System.out.println("Result =  " + (a + b));

                    break;


                case '-':


                    System.out.println("Result =  " + (a - b));
                    break;


                case '*':

                    System.out.println("Result =  " + (a * b));
                    break;


                case '/':

                    System.out.println("Result =  " + (a / b));
                    break;


            }

        }
    }

}