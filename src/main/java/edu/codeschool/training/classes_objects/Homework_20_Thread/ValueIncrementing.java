package edu.codeschool.training.classes_objects.Homework_20_Thread;

public class ValueIncrementing {
    public static void main(String[] args) {
        Counter resource=new Counter(new Resource(0));
        Thread thread1=new Thread(resource,"First");
        Thread thread2=new Thread(resource,"Second");
        thread1.start();
        thread2.start();
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


    }
}
