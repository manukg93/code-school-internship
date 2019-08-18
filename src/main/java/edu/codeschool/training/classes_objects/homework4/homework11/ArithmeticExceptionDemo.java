package edu.codeschool.training.classes_objects.homework4.homework11;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {

        try{
            int a=10, b=0;
            int c=a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e) {
            System.out.println("no divide");
        }

    }
}

