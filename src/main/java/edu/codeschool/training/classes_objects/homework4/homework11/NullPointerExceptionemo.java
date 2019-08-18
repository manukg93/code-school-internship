package edu.codeschool.training.classes_objects.homework4.homework11;

public class NullPointerExceptionemo {
    public static void main(String[] args) {

        String s = null;
        String s1 = "aaa";
        try {
            System.out.println(s.equals(s1));


        } catch (NullPointerException e) {
            System.out.println("no");
        }
    }
}