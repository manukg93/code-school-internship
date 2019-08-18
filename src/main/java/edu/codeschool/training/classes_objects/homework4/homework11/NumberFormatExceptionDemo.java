package edu.codeschool.training.classes_objects.homework4.homework11;

public class NumberFormatExceptionDemo {

    public static void main(String[] args) {
        try{
            int a=Integer.parseInt("aaa");
            System.out.println(a);
        }catch (NumberFormatException e){
            System.out.println("Exeption");
        }
    }
}
