package edu.codeschool.training.classes_objects.homework21_MultiplyThread;

public class PingPongApp {
    public static void main(String[] args) {
        Writer writer=new Writer();
        Thread thread1=new Thread(writer);
        Thread thread2=new Thread(writer);
        thread1.start();
        thread2.start();

    }
}
