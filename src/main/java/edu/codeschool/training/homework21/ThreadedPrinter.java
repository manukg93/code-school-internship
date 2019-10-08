package edu.codeschool.training.homework21;

public class ThreadedPrinter extends Thread {
    private String message;
    private Printer printer;

    public ThreadedPrinter(String msg, Printer printer1) {
        this.message = msg;
        this.printer = printer1;
    }

    @Override
    public void run() {
        while (true) {
            printer.print(message);
        }
    }
}
