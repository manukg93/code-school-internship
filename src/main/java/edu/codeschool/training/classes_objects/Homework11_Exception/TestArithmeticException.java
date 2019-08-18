package edu.codeschool.training.classes_objects.Homework11_Exception;

import java.util.Scanner;

public class TestArithmeticException {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
            int a =sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a/b);
        }catch(ArithmeticException e){
            System.out.println("'second number' cannot be 0");
        }finally {
            int a =sc.nextInt();
            int b=sc.nextInt();
            System.out.println(a/b);
        }

    }
}