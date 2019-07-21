package edu.codeschool.training.classes_objects.homework5.exercise_6;

abstract class Shape {
    private String shapeName;
    public abstract double area();

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    @Override
    public String toString() {
        return  this.shapeName ;
    }
}
