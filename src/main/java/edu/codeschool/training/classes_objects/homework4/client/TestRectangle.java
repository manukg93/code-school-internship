package edu.codeschool.training.classes_objects.homework4.client;
public class TestRectangle {
public static void main(String args[])
        {
        //This object creation would call the default constructor
        Rectangle rectangle = new Rectangle();
        System.out.println("The default values of rectangle are ");
        System.out.println("width = " + rectangle.getlength());
        System.out.println("length = "+ rectangle.getwidth());
        System.out.println("area = " + rectangle.Area());
        System.out.println("Parameter = " + rectangle.Parameter());
        Rectangle rectangle1 = new Rectangle (8,5);
        System.out.println ("The given values of rectangle are ");
        System.out.println("width = " + rectangle1.getlength());
        System.out.println("length = " + rectangle1.getwidth());
        System.out.println("area = " + rectangle.Area());
        System.out.println("Parameter = " + rectangle1.Parameter());

        }
}
