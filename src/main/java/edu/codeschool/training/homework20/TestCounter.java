package edu.codeschool.training.homework20;

public class TestCounter {
    public static void main(String[] args) {
        final int N = 1_000_000;

        Counter counter1 = new Counter(0, N/2);
        Counter counter2 = new Counter(500_000, N/2);

        Thread thread1 = new Thread(counter1);
        Thread thread2 = new Thread(counter2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            ex.getStackTrace();
        }

        long c1 = counter1.getCounter();
        long c2 = counter2.getCounter();

        System.out.println(c1 + ", " + c2);
    }
}
