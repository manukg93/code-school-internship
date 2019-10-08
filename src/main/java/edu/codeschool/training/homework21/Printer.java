package edu.codeschool.training.homework21;

public class Printer {

    public void print(String msg) {
        synchronized (msg) {
            System.out.println(msg);
            try {
                synchronized (this) {
                    Thread.sleep(1000);
                }
        } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
