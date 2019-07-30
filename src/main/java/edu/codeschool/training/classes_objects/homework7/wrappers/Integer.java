package edu.codeschool.training.classes_objects.homework7.wrappers;

import java.sql.SQLOutput;

public class Integer {
    public static final int SIZE = 32;
    public static final int MIN_VALUE = -2147483648;
    public static final int MAX_VALUE = 2147483647;
    private int value;

    // Constructors

    // Default constructor
    public Integer() {
        this.value = 0;
    }

    // Parameterized constructor
    public Integer(int value) {
        if (value < MIN_VALUE) {
            this.value = MIN_VALUE;
        } else if (value > MAX_VALUE) {
            this.value = MAX_VALUE;
        } else {
            this.value = value;
        }
    }

    // Setter
    public void setValue(int value) {
        if (value < MIN_VALUE) {
            this.value = MIN_VALUE;
        } else if (value > MAX_VALUE) {
            this.value = MAX_VALUE;
        } else {
            this.value = value;
        }
    }

    // Getter
    public int getValue() {
        return this.value;
    }

    // public methods
    public int intValue() {
        return this.value;
    }

    public byte byteValue() {
        return (byte) this.value;
    }

    public short shortValue() {
        return (short) this.value;
    }

    public long longValue() {
        return (long) this.value;
    }

    public void increment() {
        if (this.value < MAX_VALUE) {
            ++this.value;
        }
    }

    public void decrement() {
        if (this.value > MIN_VALUE) {
            --this.value;
        }
    }

    public Integer plus(Integer other) {
        if (other == null) {
            return null;
        }
         return new Integer(this.value + other.getValue());
    }

    public Integer minus (Integer other) {
        if (other == null) {
            return null;
        }
        return new Integer(this.value - other.getValue());
    }

    // Return int from string
    public int parseInt(String number) {
        if (number.isEmpty()) {
            return 0;
        }
        int num = number.charAt(0) - '0';

        for (int i = 0; i < number.length() - 1; i++) {
            if (number.charAt(i) >= '0' && number.charAt(i) <= '9') {
                num = num * 10 + (number.charAt(i+1) - '0');
            } else {
                System.out.println("String must contain only digits.");
                return 0;
            }
        }
        return num;
    }

    @Override
    public String toString() {
        String str = "";

        int number = this.value;
        while (number > 0) {
            str = number%10 + str;
            number = number / 10;
        }
        return str;
    }
}
