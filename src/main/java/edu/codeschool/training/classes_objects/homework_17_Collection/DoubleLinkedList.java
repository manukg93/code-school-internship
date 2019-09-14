package edu.codeschool.training.classes_objects.homework_17_Collection;


import java.util.*;

public class DoubleLinkedList<T> implements List<T> {
    transient Node<T> head;
    transient Node<T> tail;
    transient int size = 0;

    // empty list constructor

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void linkHead(T t) {
        Node<T> first = head;
        Node<T> newNode = new Node<>(t, first, null);
        head = newNode;
        if (first == null)
            tail = newNode;
        else
            first.prev = newNode;
        size++;
    }

    public void linkTail(T t) {
        Node<T> last = tail;
        Node<T> newNode = new Node<>(t, null, last);
        tail = newNode;
        if (last == null)
            head = newNode;
        else
            last.next = newNode;
        size++;
    }

    public T getFirst() {
        Node<T> first = head;
        if (first == null)
            throw new NoSuchElementException();
        return first.element;
    }

    public T getLast() {
        final Node<T> last = tail;
        if (last == null)
            throw new NoSuchElementException();
        return last.element;
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(T t) {
        if (tail == null) {
            throw new NoSuchElementException();
        } else {
            Node<T> newNode = new Node<>(t);
//            newNode.prev = tail;
//            newNode.element = t;
//            newNode.next = null;

            tail.next = newNode;
            tail = newNode;
            size++;
            return true;
        }
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        if (tail == null) {
            throw new NoSuchElementException();
        } else {
            Iterator<? extends T> iterator = c.iterator();
            while (c.iterator().hasNext()) {
                add(c.iterator().next());
                size++;
            }
            return true;
        }
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 1; i <= size(); i++) {
            if (head.element.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return null;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public String toString() {
        return "DoubleLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", size=" + size +
                '}';
    }
}
