package edu.codeschool.training.classes_objects.homework4;

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;
    public Rectangle() {
    }
    public Rectangle(float length){
        this.length = length;
        this.width = length;
    }
    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }

    public float getLength(){
        return this.length;
    }
    public float getWidth(){
        return this.width;
    }

    public void setLength(float length){
        this.length = length;
    }
    public void setWidth(float width){
        this.width = width;
    }

    public double calculateArea(){
        return this.length * this.width;
    }

    public double calculatePerimeter(){
        return 2*(this.length + this.width);
    }
}
