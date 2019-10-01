package edu.codeschool.training.classes_objects.Homework_20_Thread;

public class SumRun implements Runnable {
    private int[] array;
    private int sum = 0;
    int start;
    int end;

    public SumRun(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
    }
}
