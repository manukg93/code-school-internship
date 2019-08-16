package edu.codeschool.training.classes_objects.homework12.exercise1;

public class Test extends Exception{

    public static void main(String[] args){

        try{

            System.out.println("My Custom Exception test");
            throw new Test();

        }catch(Exception e){
            System.out.println("Test Exception");
        }
    }

}