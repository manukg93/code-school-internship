package edu.codeschool.training.homework14.exercise3;

import java.util.*;

public class Calculator {

    static void check(String num1){
        if(num1.equals("exit"))
            System.exit(0);
    }

    static String inputInt(Scanner input, String str)
    {
        System.out.println("input " + str + " integer: ");
        String num = input.next();
        check(num);

        try {
            Integer.parseInt(num);
        }catch (NumberFormatException e){
            System.out.println(str + " integer must be INTEGER");
            num = inputInt(input, str);
        }

        return num;
    }

    static String inputAct(Scanner input)
    {

        System.out.println("input action (+, -, / or *): ");
        String act = input.next();
        check(act);

        switch (act){
            case "+":
            case "-":
            case "*":
            case "/":
                break;
            default:
                System.out.println("action must be (+, -, / or *)");
                act = inputAct(input);
                break;
        }

        return act;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String num1, num2, act;

        while (true){
            num1 = inputInt(input, "first");
            num2 = inputInt(input, "second");

            int int1 = Integer.parseInt(num1);
            int int2 = Integer.parseInt(num2);
            act = inputAct(input);

            switch (act){
                case "+":
                    System.out.println(int1 + int2);
                    break;
                case "-":
                    System.out.println(int1 - int2);
                    break;
                case "*":
                    System.out.println(int1 * int2);
                    break;
                case "/":
                    System.out.println(int1 / int2);
                    break;
            }
        }
    }
}
