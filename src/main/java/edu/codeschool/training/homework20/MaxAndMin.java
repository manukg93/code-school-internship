package edu.codeschool.training.homework20;

public class MaxAndMin implements Runnable {
    private int[] array;
    private int start;
    private int end;
    private int max;
    private int min;

    // constructor
    public MaxAndMin (int[] array, int start, int end) {
        if (array == null) {
            return;
        }
        this.array = array;
        if (start < 0 || end > this.array.length) {
            throw new IndexOutOfBoundsException("index is out of bounds");
        }
        if (start > end) {
            throw new IllegalArgumentException("start > end");
        }
        this.start = start;
        this.end = end;
    }

    // getters
    public int getMax () {
        return this.max;
    }

    public int getMin () {
        return this.min;
    }

    private int calculateMaximum () {
        if (array == null) {
            return 0;
        }
        int max = array[0];
        for (int i = start; i < end; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    private int calculateMinimum () {
        if (array == null) {
            return 0;
        }
        int min = array[0];
        for (int i = start; i < end; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    @Override
    public void run() {
        this.max = calculateMaximum();
        this.min = calculateMinimum();
    }
}
