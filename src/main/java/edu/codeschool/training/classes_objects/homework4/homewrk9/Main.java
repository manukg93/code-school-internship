package edu.codeschool.training.classes_objects.homework4.homewrk9;

public class Main {
    public static void main(String[] args) {
        Country ob1= new Country();
        System.out.println(ob1);

        Country ob2=ob1;

        System.out.println(ob2);

        Country c1=new Country();
        Country c2=new Country(c1);
        Country c3=c2;
        System.out.println(c2);
        System.out.println(c3.equals(c2));
        System.out.println(c3==c2);
        System.out.println(ob2==ob1);
        System.out.println(ob1.equals(ob2));

    }

}
