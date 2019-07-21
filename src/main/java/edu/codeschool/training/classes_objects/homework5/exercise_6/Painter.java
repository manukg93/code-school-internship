package edu.codeschool.training.classes_objects.homework5.exercise_6;

public class Painter {
    //static paint(Shape shape, String color) in this format[Painted shape with name: ? with color: ?, with area: ? ]
    //static paint(Shape [] shapes, String color) method which prints all shapes in above described format
    public static void paint(Shape shape,String color){
        System.out.println("[Painted shape with name: " + shape.getShapeName() + ", with color: " + color +
                ", with area: " + shape.area() + "]");
    }
    public static void paint(Shape [] shape, String color){
        for(int i=0;i<shape.length;i++){
            System.out.println("[Painted shape with name: " + shape[i].getShapeName() + ", with color: " + color +
                    ", with area: " + shape[i].area() + "]");
        }
        }
    }
