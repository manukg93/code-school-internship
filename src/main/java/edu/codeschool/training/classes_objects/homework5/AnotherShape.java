package edu.codeschool.training.classes_objects.homework5;

abstract public class AnotherShape {
    public String shapeName;

    // Constructors
    public AnotherShape() {
        shapeName = "shape";
    }

    public AnotherShape(String name) {
        shapeName = name;
    }

    // Setters and getters
    public void setShapeName(String name) {
        this.shapeName = name;
    }

    public String getShapeName() {
        return shapeName;
    }

    // Abstract method
    abstract public double area();

    public String toString() {
        return shapeName;
    }
}
