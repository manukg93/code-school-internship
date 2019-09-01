package edu.codeschool.training.classes_objects.homework_16_Generics.ex_3;



public class TestPainter {
    public static void main(String[] args){
        Painter<Circle> circlePainter=new Painter<>();
        circlePainter.paint(new Circle());

        Painter<Rectangle> rectanglePainter=new Painter<>();
        rectanglePainter.paint(new Rectangle());

        Painter<Square> squarePainter=new Painter<>();
        squarePainter.paint(new Square());
    }
}
