package edu.codeschool.training.homework14.exercise3;

import java.util.*;

public class Calculator {




    static String checkInt(String num1){
        if(num1.equals("exit"))
            return "exit";
        return null;
    }

    static String inputInt(Scanner input, String str)
    {
        System.out.println("input " + str + " integer: ");
        String num = input.next();
        String ifBreak = checkInt(num);
        if(ifBreak != null)
            num = ifBreak;
        try {
            Integer.parseInt(num);
        }catch (NumberFormatException e){
            System.out.println(str + " integer must be INTEGER");
            inputInt(input, str);
        }

        return num;

    }

    static String inputAct(Scanner input)
    {

        System.out.println("input action (+, -, / or *): ");
        String act = input.next();
        String ifBreak = checkInt(act);
        if(ifBreak != null)
            act = ifBreak;


        switch (act){
            case "+":
            case "-":
            case "*":
            case "/":
            case "exit":
                break;
            default:
                System.out.println("action must be (+, -, / or *)");
                inputAct(input);
                break;
        }

        return act;

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String num1 = "";
        String num2 = "";
        String act = "";

        while (true){


            num1 = inputInt(input, "first");
            if(num1.equals("exit"))
                break;

            num2 = inputInt(input, "second");
            if(num2.equals("exit"))
                break;


//            System.out.println(num1);
//            System.out.println(num2);
            int int1 = Integer.parseInt(num1);
            int int2 = Integer.parseInt(num2);
            act = inputAct(input);
            if(act.equals("exit"))
                break;

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
        System.out.println("the program has been stopped");

    }
}
