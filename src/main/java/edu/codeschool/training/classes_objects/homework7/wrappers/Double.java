package edu.codeschool.training.classes_objects.homework7.wrappers;

public class Double {
    public static final int SIZE = 64;
    public static final double MIN_VALUE = java.lang.Double.MIN_VALUE;
    public static final double MAX_VALUE = java.lang.Double.MAX_VALUE;
    private double value;

    // Constructors

    // Default constructor
    public Double() {
        this.value = 0.0;
    }

    // Parameterized constructor
    public Double(double value) {
        if (value > MAX_VALUE) {
            this.value = MAX_VALUE;
        } else if (value < MIN_VALUE) {
            this.value = MIN_VALUE;
        } else {
            this.value = value;
        }
    }

    // Setter
    public void setValue(double value) {
        if (value > MAX_VALUE) {
            this.value = MAX_VALUE;
        } else if (value < MIN_VALUE) {
            this.value = MIN_VALUE;
        } else {
            this.value = value;
        }
    }

    // Getter
    public double getValue() {
        return this.value;
    }

    // Public methods
    public double doubleValue() {
        return (double) this.value;
    }

    public float floatValue() {
        return (float) this.value;
    }

    public Double plus(Double other) {
        if (other == null) {
            return null;
        }
        return new Double(this.value + other.getValue());
    }

    public Double minus(Double other) {
        if (other == null) {
            return null;
        }
        return new Double(this.value - other.getValue());
    }
}
