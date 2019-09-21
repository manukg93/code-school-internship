package edu.codeschool.training.homework18.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackArrayList<E> extends Stack {

    private List<E> list;

    public StackArrayList() {
        this.list = new ArrayList<>();
    }

    @Override
    public E push(Object e) {
        this.list.add((E) e);
        return (E) e;
    }

    @Override
    public synchronized E pop() {
        E e = this.list.get(this.list.size() - 1);
        this.list.remove(e);
        return e;
    }

    @Override
    public synchronized E peek() {
        E e = this.list.get(this.list.size() - 1);
        return e;
    }

    @Override
    public boolean empty() {
        return this.list.isEmpty();
    }

    @Override
    public synchronized int search(Object o) {
        int i = this.list.indexOf(o);
        return i;
    }
}
