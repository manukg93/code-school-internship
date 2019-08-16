package edu.codeschool.training.classes_objects.homework11.exercise4;


public class ExceptionTest {
    public static void main(String[] args) {

        try{
            int i=10/0; //will throw ArithmeticException
        }catch(ArithmeticException e){
            System.out.println("ArithmeticException handled in catch block");
        }
        finally{
            System.out.println("finally block executed");
        }

        System.out.println("code after try-catch-finally block");
    }
}

class ExceptionTest1 {

    public static void main(String[] args) {
        try{
            System.out.println("in try block");
            System.exit(0);
        }finally{
            System.out.println("finally block executed");
        }
    }
}

class FinallyExample {
    public static void main(String[] args) {
        try{

            /* Infinite for loop*/
            for(;;){
                System.out.println("in try block - Infinite for loop");
            }
        }finally{
            System.out.println("finally block executed");
        }
    }
}