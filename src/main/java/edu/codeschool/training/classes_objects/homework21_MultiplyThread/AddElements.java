package edu.codeschool.training.classes_objects.homework21_MultiplyThread;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {
        String[] array = new String[100];
        for (int i = 0; i < 100; i++) {
            array[i] = "Str" + i;
        }
        System.out.println(Arrays.toString(array));
        MyThread myThread = new MyThread(array);
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(myThread);
            thread.start();
        }
    }
}
