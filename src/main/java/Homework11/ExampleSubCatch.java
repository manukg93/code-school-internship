package Homework11;

public class ExampleSubCatch {
    public static void main(String args[]){
        try {
            int a = 0;
            int b = 45 / a;
        } catch(Exception e) {
            System.out.println("Catching of general Exception class ");
        }
        //catch(ArithmeticException e) {
            System.out.println("Unreachable Exception ");
        }
    }
//}
