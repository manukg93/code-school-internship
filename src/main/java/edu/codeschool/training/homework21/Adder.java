package edu.codeschool.training.homework21;

import java.util.List;

public class Adder implements Runnable {
    private List list;
    private int start;
    private int end;

    public Adder(List list, int start, int end) {
        this.list = list;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        synchronized (this) {
            for (int i = start; i <= end; i++) {
                list.add(i);
            }
        }
    }
}
