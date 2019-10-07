package edu.codeschool.training.homework20;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CalculateMaxAndMin {
    public static void main(String[] args) {
        final int SIZE = 100;
        int[] array = new int[SIZE];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        List<MaxAndMin> objects = new ArrayList<>();
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            MaxAndMin obj = new MaxAndMin(array, i*SIZE/10, (i+1)*SIZE/10);
            Thread thread = new Thread(obj);
            objects.add(obj);
            thread.start();
            threads.add(thread);
        }
        try {
            for ( Thread thread : threads ) {
                thread.join();
            }
        } catch (InterruptedException ex) {
            ex.getStackTrace();
        }
        int max = array[0];
        int min = array[0];
        for ( MaxAndMin obj : objects ) {
            if (obj.getMax() > max) {
                max = obj.getMax();
            } else if (obj.getMin() < min) {
                min = obj.getMin();
            }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
}
