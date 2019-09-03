package edu.codeschool.training.classes_objects.homework_18;

import java.util.Collection;
import java.util.Iterator;

public class CustomList<E> implements List<E> {
    E[] elements = (E[]) new Object[10];
    int index;


    public void add(E e) {
        elements[index] = e;
        index++;
        if (index >= elements.length) {
            E[] newElements = (E[]) new Object[20];
            for (int i = 0; i < elements.length; i++) {
                newElements[i] = elements[i];
            }

            this.elements = newElements;
        }
        elements[index] = e;
    }

    public E get(int index) {
        return elements[index];
    }

    public int size() {
        return index;
    }

    public boolean contains(E e) {
        return indexOf(e) >= 0;
    }

    public int indexOf(E e) {
        if (e == null) {
            for (int i = 0; i < elements.length; i++)
                if (elements[i] == null)
                    return i;
        } else {
            for (int i = 0; i < elements.length; i++)
                if (e.equals(elements[i]))
                    return i;
        }
        return -1;

    }
}