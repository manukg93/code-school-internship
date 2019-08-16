package edu.codeschool.training.exceptions.homework12;

public class Test4 {

    String className;

    public static void main(String[] args) {

        try {
            Test4 t = new Test4();

            if (t.className.equals("Test4")) {
                System.out.println("Test4");
            } else {
                System.out.println("Other");
            }
            // NullPointerException catch block must come before
            // Exception class catch block
        } catch (NullPointerException ne) {
            System.out.println("Null");
        }catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
