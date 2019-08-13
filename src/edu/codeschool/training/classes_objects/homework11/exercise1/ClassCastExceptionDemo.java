package edu.codeschool.training.classes_objects.homework11.exercise1;

public class ClassCastExceptionDemo {
    public static void main(String[] args) {
        Object i = Integer.valueOf(42);

        try {
            String s = (String)i;
            System.out.println(s);
        }
        catch(ClassCastException e) {
            System.out.println("there is an error in your code");
        }
        finally {
            System. out. println( "finally") ;
        }
    }
}
