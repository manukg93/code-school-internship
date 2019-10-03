package edu.codeschool.training.homework20;

public class TestCounter {
    public static void main(String[] args) {
        final int N = 1_000_000;
        Counter counter1 = new Counter(0, N);
        Thread thread1 = new Thread(counter1);
        Thread thread2 = new Thread(counter1);

        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException ex) {
            ex.getStackTrace();
        }

        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException ex) {
            ex.getStackTrace();
        }

        long c1 = counter1.getCounter();
        System.out.println(c1);
    }
}
