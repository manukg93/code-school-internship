package edu.codeschool.training.exceptions.homework12;

public class Test8 {

    public static void main(String[] args) {

        try {
            AnotherClass obj = new AnotherClass();
            obj.method1();
            System.out.println("Main completed");
        } catch (Exception e) {}
    }
}

class AnotherClass {

    public void method2() {
        throw new ArrayIndexOutOfBoundsException();
    }

    public void method1() {

        try {
            method2();
        } catch (NullPointerException e) {
            System.out.println("Eception caught");
        } finally {
            System.out.println("Method1 ends");
        }
    }
}
