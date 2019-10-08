package edu.codeschool.training.homework21;

import java.util.ArrayList;
import java.util.List;

public class AdderDemo {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Adder(integers, i*10+1, (i+1)*10));
            thread.start();
            threads.add(thread);
        }
        try {
            for ( Thread thread : threads ) {
                thread.join();
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println(integers);
    }
}
