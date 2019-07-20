package edu.codeschool.training.classes_objects.homework5.exercise6;

public abstract class Shape {
    private String shapeName;

    public abstract double area();

    @Override
    public String toString() {
        return shapeName;
    }
}
