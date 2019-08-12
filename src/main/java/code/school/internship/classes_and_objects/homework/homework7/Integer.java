package code.school.internship.classes_and_objects.homework.homework7;


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
