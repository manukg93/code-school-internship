package edu.codeschool.training.enums.homework10;

public enum Month {
    JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31),
    JUNE(30), JULY(31), AUGUST(31), SEPTEMBER(30), OCTOBER(31),
    NOVEMBER(30), DECEMBER(31);

    // private field, number of days for each month
    private int daysCount;

    // getter
    public int getDaysCount() {
        return this.daysCount;
    }

    // enum constructor with parameter
    private Month(int daysCount) {
        if (daysCount == 28 || daysCount == 30 || daysCount == 31) {
            this.daysCount = daysCount;
        } else {
            this.daysCount = 0;
        }
    }
}
