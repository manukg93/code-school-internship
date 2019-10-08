package edu.codeschool.training.homework21;

public class PrintPingPong {
    public static void main(String[] args) {
        Printer printer = new Printer();
        ThreadedPrinter th1 = new ThreadedPrinter("ping", printer);
        ThreadedPrinter th2 = new ThreadedPrinter("pong", printer);

        th1.start();
        th2.start();
    }
}