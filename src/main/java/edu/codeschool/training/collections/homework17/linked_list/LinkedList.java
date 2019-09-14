package edu.codeschool.training.collections.homework17.linked_list;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList<E> implements List<E> {

    private Node<E> head;
    private Node<E> tail;
    private int count;

    // default constructor
    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    // setters
    public void setHead(Node<E> head) {
        if (head != null) {
            this.head = head;
        }
    }

    public void setTail(Node<E> tail) {
        if (tail != null) {
            this.tail = tail;
        }
    }

    // getters
    public Node<E> getHead() {
        return this.head;
    }

    public Node<E> getTail() {
        return this.tail;
    }

    @Override
    public int size() {
        return this.count;
    }

    @Override
    public boolean isEmpty() {
        return (this.size() == 0);
    }

    @Override
    public boolean contains(Object value) {
        return (this.indexOf(value) >= 0);
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator<E>(this);
    }

    @Override
    public Object[] toArray() {
        if (this == null) {
            return null;
        }
        Object[] array = new Object[this.count];
        Node node = this.head;
        int i = 0;
        while (node != null) {
            array[i++] = node.getValue();
            node = node.getNext();
        }
        return array;
    }

    @Override
    public <T> T[] toArray(T[] var1) {
        return null;
    }

    @Override
    public boolean add(E value) {
        if (value == null) {
            throw new NullPointerException("Null object added");
        }
        Node nextNode = new Node<>(value);
        if (this.head == null) {
            this.head = this.tail = nextNode;
            this.head.setPrevious(null);
        }
        this.tail.setNext(nextNode);
        nextNode.setPrevious(tail);
        this.tail = nextNode;
        this.count++;
        return true;
    }

    @Override
    public void add(int index, E element) {
        if (index < 0 || index >= this.count) {
            throw new IllegalArgumentException("Not valid index");
        }
        if (element == null) {
            throw new NullPointerException("Null object added");
        }
        if (this.count == 0) {
            return;
        }
        Node<E> node = this.head;
        if (index == 0) {
            Node<E> newNode = new Node<>(element);
            node.setPrevious(newNode);
            newNode.setNext(node);
            this.head = newNode;
            this.count++;
            return;
        }
        int i = 1;
        while (i != index) {
            node = node.getNext();
            i++;
        }
        Node<E> newNode = new Node<>(element);
        newNode.setPrevious(node);
        newNode.setNext(node.getNext());
        node.setNext(newNode);
        this.count++;
    }

    @Override
    public boolean addAll(Collection<? extends E> var1) {
        if (var1 == null) {
            throw new NullPointerException("Collection is null");
        }
        for ( Object obj : var1 ) {
            if (obj == null) {
                throw new NullPointerException("Collection contains null object.");
            }
        }
        for ( E obj : var1 ) {
            this.add(obj);
        }

        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> col) {
        int i = index;
        int ct = this.count;
        for ( E obj : col ) {
            this.add(i, obj);
            i++;
        }
        if (this.count == ct + col.size()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object value) {
        if (value == null) {
            throw new NullPointerException("Null object removed");
        }
        Node<E> node = this.head;
        if (value == node.getValue()) {
            node.setValue(null);
            node.getNext().setPrevious(null);
            this.head = node.getNext();
            node.setNext(null);
            node = this.head;
            this.count--;
            return true;
        }
        while (node != this.tail) {
            if (value != node.getValue()) {
                node = node.getNext();
            } else {
                node.setValue(null);
                node.getPrevious().setNext(node.getNext());
                node.getNext().setPrevious(node.getPrevious());
                this.count--;
                return true;
            }
        }
        if (node == this.tail && value == node.getValue()) {
            node.setValue(null);
            this.tail = node.getPrevious();
            node.getPrevious().setNext(null);
            node.setPrevious(null);
            node = tail;
            this.count--;
            return true;
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> var1) {
        if (var1 == null) {
            throw new NullPointerException("Null collection checked.");
        }
        for ( Object obj : var1 ) {
            if (obj == null) {
                throw new NullPointerException("Collection contains null object.");
            }
        }
        for ( Object obj : var1 ) {
            if (!this.contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int indexOf(Object o) {
        if (o == null) {
            throw new NullPointerException("Searched object is null.");
        }
        if (this.count == 0) {return -1;}
        Node<E> node = this.head;
        int index = 0;

        while (index < this.count) {
            if (o == node.getValue()) {
                return index;
            }
            node = node.getNext();
            index++;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        if (o == null) {
            throw new NullPointerException("Searched object is null.");
        }
        if (this.count == 0) {return -1;}
        Node<E> node = this.tail;
        int index = this.count - 1;

        while (index >= 0) {
            if (o == node.getValue()) {
                return index;
            }
            node = node.getPrevious();
            index--;
        }
        return  -1;
    }

    @Override
    public boolean removeAll(Collection<?> var1) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> var1) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean equals(Object var1) {
        return false;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public E get(int var1) {
        E e = null;
        return e;
    }

    @Override
    public E set(int var1, E var2) {
        E e = null;

        return e;
    }

    @Override
    public E remove(int var1) {
        E e = null;
        return e;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int var1) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {

        return null;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("[");
        Iterator<E> it = this.iterator();
        while (it.hasNext()) {
            str.append(it.next().toString()).append(", ");
        }
        str.append("]");
        return str.toString();
    }
}
