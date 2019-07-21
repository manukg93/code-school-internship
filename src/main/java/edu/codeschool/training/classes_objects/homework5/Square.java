package edu.codeschool.training.classes_objects.homework5;

public class Square extends Rectangle {
    public Square() {
    }
    public Square(double side){
        super(side,side);
    }
    public Square(String color,boolean filled, double side){
        super(color,filled,side,side);
    }


    @Override
    public String toString(){
        return "A Square with side=" + super.getLength()+ " , which is a subclass of  "+ super.toString();
    }



}
