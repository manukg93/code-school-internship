package edu.codeschool.training.homework20;

public class Print implements Runnable {
    private Counter counter;

    // Print constructor
    public Print(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        long c = this.counter.getCounter();
        System.out.println(c);
    }
}
