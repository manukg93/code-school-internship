package Homework5.ClassesHomework5;

public class RectangleShape extends Shape{
    public double width;
    public double length;
    public RectangleShape(){
        width = 1.0;
        length = 1.0;
    }
    public RectangleShape(double width, double length){
        if (width < 0){
            this.width=1.0;
            return;
        }
        this.width=width;
        if(length < 0){
            this.length = 1.0;
            return;
        }
        this.length=length;
    }
    public double getWidth() { return width; }
    public double getLength() { return length; }
    public double getArea() {return width*length; }
    public double getPerimeter() { return (width+length)*2; }

    @Override
    public String toString() {
        String result;
        result = "A rectangle with width=" + width + " and" + " length=" + length + " which is a sublass of " + super.toString();
        return result;
    }
}
