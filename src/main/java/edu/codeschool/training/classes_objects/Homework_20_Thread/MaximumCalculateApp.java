package edu.codeschool.training.classes_objects.Homework_20_Thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MaximumCalculateApp {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        List<Integer> maximumArray = new ArrayList<>();
        List<Integer> minimumArray = new ArrayList<>();

        for (int i = 0; i <array.length; i++) {
            //array[i] = random.nextInt();
             array[i] = i;
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < 10; i++) {
            MaxAndMinArray maxAndMinArray = new MaxAndMinArray(array, i * array.length / 10, (i + 1) * array.length / 10);
            Thread thread = new Thread(maxAndMinArray);
            thread.start();
            try {
                thread.join();
                maximumArray.add(maxAndMinArray.getMax());
                minimumArray.add(maxAndMinArray.getMin());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(maximumArray);
        System.out.println(minimumArray);
    }
}
