package edu.codeschool.training.collections.homework18;

import java.util.ArrayList;
import java.util.List;

public class CustomStack1<E> {
    private List<E> list;

    // creates empty Stack
    public CustomStack1() {
        this.list = new ArrayList<>();
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
        E obj = list.remove(len - 1);
        return obj;
    }

    public E peek() throws StackIsEmptyException {
        int len = this.list.size();
        if (len == 0) {
            throw new StackIsEmptyException("Stack is empty");
        }
        E obj = list.get(len - 1);
        return obj;
    }

    public boolean empty() {
        return list.size() == 0;
    }

    public int search(Object o) {
        int i = this.list.lastIndexOf(o);

        if (i < 0) {
            return -1;
        }
        return list.size() - i;
    }
}
