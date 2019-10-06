package edu.codeschool.training.classes_objects.homework21_MultiplyThread;

import java.util.ArrayList;
import java.util.List;

public class MyThread<T> implements Runnable {
    private T[] array;
    private List<T> list = new ArrayList();
    private int count = 0;

    public MyThread(T[] array) {
        this.array = array;
    }

    synchronized void addToList() {
        if (count < array.length / 10) {
            for (int i = count * 10; i < (count + 1) * 10; i++) {
                list.add(array[i]);
            }
            System.out.print(Thread.currentThread().getName() + " ");
            System.out.println(list);
        } else {
            System.out.println("The quantity of threads must be lower than " + array.length / 10);
        }
    }

    @Override
    public void run() {
        if (count < array.length / 10) {
            try {
                addToList();
            } catch (Exception e) {
                e.printStackTrace();
            }
            count++;
        } else {
            System.out.println("The quantity of threads must be lower than " + array.length / 10);
        }
    }
}