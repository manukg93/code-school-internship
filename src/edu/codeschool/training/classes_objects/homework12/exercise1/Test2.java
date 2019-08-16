package edu.codeschool.training.classes_objects.homework12.exercise1;

public class Test2 extends Exception{

    private String message;

    public Test2(String message){
        this.message = message;
    }

    public static void main(String[] args){

        int a = 5, b = 3;
        try{

//            if( a % b > 0 )
//                throw new Test2();

        }catch(Exception e){
            System.out.println("Test Exception");
        }
    }

}
