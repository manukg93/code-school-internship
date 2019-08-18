package edu.codeschool.training.classes_objects.Homework11_Exception;

import edu.codeschool.training.classes_objects.homework9_Object_Clone.City;

public class TestClassCastException {
    public static void main(String[] args) {
        Object obj = new Integer(13);
        try{
            System.out.println((String) obj);
        }catch (ClassCastException ex){
            System.out.println("Wrong cast!!!");
        }
    }
}

