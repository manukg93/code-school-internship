package edu.codeschool.training.homework20;

public class Counter implements Runnable {

    private long counter = 0;
    private int end;

    // Counter constructor
    public Counter (int start, int end) {
        this.counter = start;
        this.end = end;
    }

    // private method, increments counter
    private void increment() {
        for (long i = 0; i < this.end; i++) {
            ++this.counter;
        }
    }

    public long getCounter() {
        return this.counter;
    }

    @Override
    public void run() {
        increment();
    }
}
