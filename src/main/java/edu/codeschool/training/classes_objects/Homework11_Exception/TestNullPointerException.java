package edu.codeschool.training.classes_objects.Homework11_Exception;

import edu.codeschool.training.classes_objects.homework9_Object_Clone.City;

public class TestNullPointerException {
    public static void main(String[] args) {
        String str1=null;
        String str2="Hayk";
        try{
            System.out.println(str1.equals(str2));
        }catch(NullPointerException ex){
            System.out.println("Caught NullPointerException");
            System.out.println(ex.toString());
        }
    }
}
