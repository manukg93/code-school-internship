package edu.codeschool.training.classes_objects.homework9_Object_Clone;

public class TestClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Country country1=new Country();
        System.out.println(country1);
        Country country2=country1;
        System.out.println(country1==country2);
        Country country3=(Country)country1.clone();
        System.out.println(country3);
        System.out.println(country3==country1);
    }
}
