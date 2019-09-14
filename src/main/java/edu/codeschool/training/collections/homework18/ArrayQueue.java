package edu.codeschool.training.collections.homework18;

import java.util.List;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ArrayQueue<E> {
    private List<E> list;
    private int size;

    // create empty queue
    public ArrayQueue(int size) {
        this.list = new ArrayList<>();
        if (size <= 0) {
            this.size = 0;
        }
        this.size = size;
    }

    public boolean add(E e) {
        if (e == null) {
            throw new NullPointerException("Null object added");
        }
        if (this.list.size() >= this.size) {
            throw new IllegalStateException("Capacity restriction");
        }
        this.list.add(e);
        return true;
    }

    public boolean offer(E e) {
        if (e == null) {
            throw new NullPointerException("Null object offered");
        }
        if (this.list.size() >= this.size) {
            return false;
        }
        this.list.add(e);
        return true;
    }

    public E remove() {
        if (this.list.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return this.list.remove(0);
    }

    public E poll() {
        if (this.list.isEmpty()) {
            return null;
        }
        return this.list.remove(0);
    }

    public E element() {
        if (this.list.isEmpty()) {
            throw new NoSuchElementException("Queue is empty");
        }
        return this.list.get(0);
    }

    public E peek() {
        if (this.list.isEmpty()) {
            return null;
        }
        return this.list.get(0);
    }

    @Override
    public String toString() {
        return this.list.toString();
    }
}
