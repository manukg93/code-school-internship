package edu.codeschool.training.homework20;

public class MaximumAndMinimum implements Runnable {
    private int[] array;
    private int start;
    private int end;
    private int max;
    private int min;

    // Maximum class' constructor
    public MaximumAndMinimum (int[] array, int start, int end) {
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

    // find maximum and minimum values of the array
    private void calculateMaximumAndMinimum () {
        if (array == null) {
            return;
        }
        max = array[0];
        min = array[0];
        for (int i = start; i < end; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
    }

    @Override
    public void run() {
        calculateMaximumAndMinimum();
    }
}
