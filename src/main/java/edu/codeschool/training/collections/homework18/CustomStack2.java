package edu.codeschool.training.collections.homework18;

import java.util.LinkedList;
import java.util.List;

public class CustomStack2<E> {
    private List<E> list;

    public CustomStack2() {
        this.list = new LinkedList<>();
    }

    public E push(E item) {
        this.list.add(item);
        return item;
    }

    public E pop() throws StackIsEmptyException {
        int len = this.list.size();
        if (len == 0) {
            throw new StackIsEmptyException("Stack is empty");
        }
        return this.list.remove(len - 1);
    }

    public E peek() throws StackIsEmptyException {
        int len = this.list.size();
        if (len == 0) {
            throw new StackIsEmptyException("Stack is empty");
        }
        return this.list.get(len - 1);
    }

    public boolean empty() {
        return this.list.size() == 0;
    }

    public int search(Object o) {
        int i = this.list.lastIndexOf(o);
        if (i < 0) {
            return -1;
        }
        return this.list.size() - i;
    }
}