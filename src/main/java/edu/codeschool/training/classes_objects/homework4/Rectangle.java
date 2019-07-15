package edu.codeschool.training.classes_objects.homework4;

public class Rectangle {
    private float length = 1.0f;
    private float width=1.0f;

    public Rectangle(float length){
        this.length=length;
    }
    public Rectangle(float length,float width){
        this.width=width;
        this.length=length;
    }

    public float getLength() {
        return length;
    }

    public float getWidth(){
        return width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    public float calculateArea(){
        return width*length;
    }
    public float calculatePerimeter(){
        return (width+length)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ",area="+calculateArea()+
                ",perimeter="+calculatePerimeter()+
                '}';
    }
}
