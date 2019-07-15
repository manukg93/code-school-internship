package edu.codeschool.training.classes_objects.homework4.client;

import edu.codeschool.training.classes_objects.homework4.Rectangle;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
            System.out.println("Area     = "+r1.calculateArea());
            System.out.println("Perimetr = "+r1.calculatePerimeter());
            System.out.println("Length   = "+r1.getLength());
            System.out.println("Width    = "+r1.getWidth());
            System.out.println();
        Rectangle r2=new Rectangle(20,10);
            System.out.println("Area     = "+r2.calculateArea());
            System.out.println("Perimetr = "+r2.calculatePerimeter());
            System.out.println("Length   = "+r2.getLength());
            System.out.println("Width    = "+r2.getWidth());
        System.out.println();
        Rectangle r3=new Rectangle(15,11);
            System.out.println("Area     = "+r3.calculateArea());
            System.out.println("Perimetr = "+r3.calculatePerimeter());
            System.out.println("Length   = "+r3.getLength());
            System.out.println("Width    = "+r3.getWidth());
    }
}
