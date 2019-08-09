package edu.codeschool.training.classes_objects.homework9_Object_Clone;

public class TestClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Country country1=new Country();
        Country country2=(Country)country1.clone();
        Country country3=new Country(country1);
        System.out.println(country1==country3);
        System.out.println(country1.equals(country3));
    }
}
