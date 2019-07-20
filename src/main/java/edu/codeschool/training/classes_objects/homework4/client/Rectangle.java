package edu.codeschool.training.classes_objects.homework4.client;

class Rectangle {
    private float length;
    private float width;

    Rectangle() {
        //Default constructor
        length = 1.0f;
        width = 1.0f;
    }

    Rectangle(float a, float b) {
        //Parameterized constructor
        length = a;
        width = b;
    }

    //Getter and setter methods
    public float getlength() {
        return length;
    }

    public void setlength(float length) {
        this.length = length;
    }

    public float getwidth() {
        return width;
    }

    public void setwidth(float width) {
        this.width = width;
    }

    public float Area() {
        return width * length;
    }

    public float Parameter() {
        return (width + length) * 2;
    }

}










