package edu.codeschool.training.classes_objects.homework7.exercise1;

public class Double {
    private double value;

    public Double(){
        this.value = 0.0;
    }
    public Double(double v) {
        this.value = v;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public double doubleValue() {
        return this.value;
    }

    public void increment() {
        this.value++;
    }

    public Double plus(Double other) {
        return new Double(this.value + other.getValue());
    }
}
