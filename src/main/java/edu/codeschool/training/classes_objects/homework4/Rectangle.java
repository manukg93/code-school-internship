package edu.codeschool.training.classes_objects.homework4;

public class Rectangle {
    float length;
    float width;

    // Default constructor
    public Rectangle() {
        length = 1.0f;
        width = 1.0f;
    }

    // Overloaded constructors
    public Rectangle(float length) {
        if (length >= 0) {
            this.length = length;
        } else {
            this.length = 1.0f;
            System.out.println("Wrong parameter passed.");
        }

        this.width = 1.0f;
    }

    public Rectangle(float length, float width) {
        if (length >= 0 && width >= 0) {
            this.length = length;
            this.width = width;
        } else {
            this.length = 1.0f;
            this.width = 1.0f;
            System.out.println("Wrong parameters");
        }

    }

    //

    public float getLength() {
        return length;
    }

    public float getWidth () {
        return width;
    }

    public void setLength (float length) {
        if (length >= 0) {
            this.length = length;
        } else {
            this.length = 1.0f;
            System.out.println("Wrong parameter passed.");
        }
    }
     public void setWidth (float width) {
        if (width >= 0) {
            this.width = width;
        } else {
            this.width = 1.0f;
            System.out.println("Wrong parameter passed.");
        }
     }

     public float calculateArea() {
        return length * width;
     }

     public float calculatePerimeter() {
        return length * 2 + width * 2;
     }
}
