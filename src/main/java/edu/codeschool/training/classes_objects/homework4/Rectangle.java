package edu.codeschool.training.classes_objects.homework4;

public class Rectangle {
    private float length;
    private float width;
    public Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }

    public Rectangle(float length) {
        this.length = length;
        this.width=length;
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    public float calculateArea(){
        return length*width/2;
    }
    public float calculatePerimeter(){
        return (length+width)*2;
    }
}

