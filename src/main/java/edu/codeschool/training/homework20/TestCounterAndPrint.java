package edu.codeschool.training.homework20;

public class TestCounterAndPrint {
    public static void main(String[] args) {

        Counter counter = new Counter(10, 1_000_000);
        Print print = new Print(counter);

        Thread thread1 = new Thread(counter); // increment 10 value 1 000 000 times
        Thread thread2 = new Thread(print); // print the result

        thread1.start();

        try {
            thread1.join();
        } catch (InterruptedException ex) {
            System.out.println(ex.getStackTrace());
        }

        thread2.start();

    }
}
