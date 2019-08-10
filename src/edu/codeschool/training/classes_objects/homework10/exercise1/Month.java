package edu.codeschool.training.classes_objects.homework10.exercise1;

public enum Month {
    JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30),
    JULY(31), AUGUST(31), SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31);
    private int daysCount;

    Month(int daysCount) {
        this.daysCount = daysCount;
    }

    public int getDaysCount() {
        return daysCount;
    }
}
