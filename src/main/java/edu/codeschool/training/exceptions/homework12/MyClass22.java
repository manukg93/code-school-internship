package edu.codeschool.training.exceptions.homework12;

public class MyClass22 {

    static String str = "";

    public static void main(String[] args) {

        try {
            str += "a";
            throw new Exception();
        } catch (Exception e) {
            str += "b";
        } finally {
            str += "c";
            try {
                method();
            } catch (NullPointerException ne) {
                str += "d";
            }
        }

        System.out.println(str);
    }

    static void method() {
        throw new NullPointerException();
    }
}
