package edu.codeschool.training.classes_objects.homework7.exercise1;

public class Integer {
    private int value;

    public Integer() {
        this.value = 0;
    }

    public Integer(int i) {
        this.value = i;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int intValue() {
        return this.value;
    }

    public int parseInt(String number) {
        int n = java.lang.Integer.parseInt(number);
        return n;
    }

    public void increment() {
            this.value++;
    }

    public Integer plus(Integer other) {
        return new Integer(this.value + other.getValue());
    }

    @Override
    public String toString() {
        return "Integer{" +
                "value=" + value +
                '}';
    }
}
