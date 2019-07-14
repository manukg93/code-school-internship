package edu.codeschool.training.classes_objects.homework4.client;


import edu.codeschool.training.classes_objects.homework4.Rectangle;

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10);
            System.out.println("Rectangle1 Length= "+rectangle1.getLength()+" , Width= "+ rectangle1.getWidth());
            System.out.println("Rectangle1 Area = "+rectangle1.calculateArea());
            System.out.println("Rectangle1 Perimeter = "+rectangle1.calculatePerimeter());
            System.out.println();
        Rectangle rectangle2 = new Rectangle(20,10);
            System.out.println("Rectangle2 Length= "+rectangle2.getLength()+" , Width= "+ rectangle1.getWidth());
            System.out.println("Rectangle2 Area = "+rectangle2.calculateArea());
            System.out.println("Rectangle2 Perimeter = "+rectangle2.calculatePerimeter());
            System.out.println();
        Rectangle rectangle3 = new Rectangle(20.5f,50.75f);
            System.out.println("Rectangle3 Length= "+rectangle3.getLength()+" , Width= "+ rectangle1.getWidth());
            System.out.println("Rectangle3 Area = "+rectangle3.calculateArea());
            System.out.println("Rectangle3 Perimeter = "+rectangle3.calculatePerimeter());

    }
}