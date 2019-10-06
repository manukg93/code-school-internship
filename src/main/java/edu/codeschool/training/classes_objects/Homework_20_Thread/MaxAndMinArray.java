package edu.codeschool.training.classes_objects.Homework_20_Thread;

public class MaxAndMinArray implements Runnable {
    private int[] array;
    private int max;
    private int min;
    private int start;
    private int end;

    public MaxAndMinArray(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
        this.min=array[start];
        this.max=array[start];
    }

    public int getMax() {
        return this.max;
    }

    public int getMin() {
        return this.min;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            if (array[i] > max) {
                this.max = array[i];
            }
            if (array[i] < min) {
                this.min = array[i];
            }
        }
//        System.out.println(Thread.currentThread().getName() + "- max = " + this.max);
//        System.out.println(Thread.currentThread().getName() + "- min = " + this.min);
    }
}
