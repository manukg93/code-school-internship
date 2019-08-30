package edu.codeschool.training.generics.homework16;

public class TestPainter {
    public static void main(String[] args) {

        Collection<Drawable> dr = new Collection<>(6);
        dr.add(new Circle());
        dr.add(new Rectangle());
        dr.add(new Square());
        dr.add(new Rectangle());

        Painter.paint(dr);
    }

}
