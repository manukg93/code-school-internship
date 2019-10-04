package edu.codeschool.training.homework20;

public class TestMaximumAndMinimum {
    public static void main(String[] args) {
        final int SIZE = 100;
        int[] array = new int[SIZE];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

//        for (int i = 0; i < 10; i++) {
//            Thread thread = new Thread(new MaximumAndMinimum(array, ))
//        }
        MaximumAndMinimum obj1 = new MaximumAndMinimum(array, 0, 10);
        MaximumAndMinimum obj2 = new MaximumAndMinimum(array, 10, 20);
        MaximumAndMinimum obj3 = new MaximumAndMinimum(array, 20, 30);
        MaximumAndMinimum obj4 = new MaximumAndMinimum(array, 30, 40);
        MaximumAndMinimum obj5 = new MaximumAndMinimum(array, 40, 50);
        MaximumAndMinimum obj6 = new MaximumAndMinimum(array, 50, 60);
        MaximumAndMinimum obj7 = new MaximumAndMinimum(array, 60, 70);
        MaximumAndMinimum obj8 = new MaximumAndMinimum(array, 70, 80);
        MaximumAndMinimum obj9 = new MaximumAndMinimum(array, 80, 90);
        MaximumAndMinimum obj10 = new MaximumAndMinimum(array, 90, 100);

        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);
        Thread thread3 = new Thread(obj3);
        Thread thread4 = new Thread(obj4);
        Thread thread5 = new Thread(obj5);
        Thread thread6 = new Thread(obj6);
        Thread thread7 = new Thread(obj7);
        Thread thread8 = new Thread(obj8);
        Thread thread9 = new Thread(obj9);
        Thread thread10 = new Thread(obj10);

        try {
            thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();
            thread5.start();
            thread6.start();
            thread7.start();
            thread8.start();
            thread9.start();
            thread10.start();

            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
            thread6.join();
            thread7.join();
            thread8.join();
            thread9.join();
            thread10.join();

        } catch (InterruptedException ex) {
            System.out.println(ex.getStackTrace());
        }

        System.out.println("max: " + obj1.getMax() + " min: " + obj1.getMin());
        System.out.println("max: " + obj2.getMax() + " min: " + obj2.getMin());
        System.out.println("max: " + obj3.getMax() + " min: " + obj3.getMin());
        System.out.println("max: " + obj4.getMax() + " min: " + obj4.getMin());
        System.out.println("max: " + obj5.getMax() + " min: " + obj5.getMin());
        System.out.println("max: " + obj6.getMax() + " min: " + obj6.getMin());
        System.out.println("max: " + obj7.getMax() + " min: " + obj7.getMin());
        System.out.println("max: " + obj8.getMax() + " min: " + obj8.getMin());
        System.out.println("max: " + obj9.getMax() + " min: " + obj9.getMin());
        System.out.println("max: " + obj10.getMax() + " min: " + obj10.getMin());
    }
}
