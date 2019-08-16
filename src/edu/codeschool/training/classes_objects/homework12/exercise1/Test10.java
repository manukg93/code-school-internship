package edu.codeschool.training.classes_objects.homework12.exercise1;

public class Test10 {

    public static void main(String[] args){

        try{

            AnotherClass obj = new AnotherClass();
            obj.method1();
            System.out.println("Main Completed");

        }catch (Exception e){}

    }
}

class AnotherClass{

    public void method2(){
        throw new ArrayIndexOutOfBoundsException();
    }

    public void method1(){

        try{
            method2();
        }catch (NullPointerException ae){
            System.out.println("Exception caught");
        }finally{
            System.out.println("Method 1 ends");
        }

    }
}
