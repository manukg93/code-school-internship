package Homework5.ClassesHomework5;

public class Square extends RectangleShape {
    public Square(double side){
        super(side, side);
    }

    @Override
    public String toString() {
        String result;
        result = "A Square with side " + super.getWidth() + " which is a subclass of " + super.toString();
        return result;
    }
}
