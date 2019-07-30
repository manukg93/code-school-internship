package edu.codeschool.training.classes_objects.homework7.exercise1;

public class Boolean {
    private boolean b;

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Boolean{" +
                "b=" + b +
                '}';
    }

    public Boolean(boolean b) {
        this.b = b;
    }
}
