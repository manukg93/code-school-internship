package edu.codeschool.training.exceptions.homework12;

public class Test3 {

    public static void main(String[] args) {

        try {
            Test3 t = new Test3();
            int d = t.getNum(3, 5);
            System.out.println(d);
        } catch (Exception e) {
            System.out.println("Exception 1");
        }
    }

    public int getNum(int a, int b) {

        int c = 0;

        try {
            c = a * b;
            if (c > 10) {
                throw new Exception("Cannot be more than 10"); // String is not Throwable
            }
        } catch (Exception e) {
            System.out.println("Exception 2");
        }

        return c;
    }
}
