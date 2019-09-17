package edu.codeschool.training.homework17.exercise2;

import java.util.*;

public class LinkedList<E> implements List {

    private Node<E> head;
    private Node<E> tail;
    private int size = 0;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        if(this.size == 0)
            return true;

        return false;
    }

    @Override
    public boolean contains(Object o) {
        Node<E> node = this.head;
        for(int i = 0; i < this.size; i++){
            if(node.equals(o))
                return true;
            node = node.getNext();
        }

        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[this.size];
        Node<E> node = this.head;
        for(int i = 0; i < this.size; i++){
            array[i] = node.getValue();
            node = node.getNext();
        }
        return array;
    }

    @Override
    public boolean add(Object o) {
        Node<E> nodeHead = this.head;
        Node<E> nodeTail = this.tail;
        Node<E> node = (Node<E>) new Node<>(o);
        if (nodeHead == null){
            this.head = node;
        }else{
            this.tail.setNext(node);
            node.setPrevious(this.tail);
        }

        this.tail = node;
        this.size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        Node<E> node = this.head;
        while (node != this.tail) {
            if (o != node.getValue()) {
                node = node.getNext();
            } else {
                node.setValue(null);
                if(o.equals(this.head)){
                    node.setValue(null);
                    this.head = node.getNext();
                    node.getNext().setPrevious(null);
                    node.setNext(null);
                }else if(o.equals(this.tail)){
                    node.setValue(null);
                    this.tail = node.getPrevious();
                    node.getPrevious().setNext(null);
                    node.setPrevious(null);
                }else{
                    node.getPrevious().setNext(node.getNext());
                    node.getNext().setPrevious(node.getPrevious());
                }
                this.size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection collection) {

        for ( Object obj : collection ) {
            this.add(obj);
        }

        return true;
    }


    @Override
    public boolean addAll(int i, Collection collection) {

        for ( Object obj : collection ) {
            this.add(i, obj);
            i++;
        }
        return true;
    }

    @Override
    public void clear() {
        for(int i = 0; i < this.size; i++){
            this.remove(i);
        }
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    @Override
    public E get(int i) {
        Node<E> node = this.head;
        Node<E> nodeTail = this.tail;

        if(i > (this.size / 2)){
            int j = this.size;
            while (j != i) {
                node = nodeTail.getPrevious();
                j--;
            }
        } else {
            int j = 0;
            while (j != i) {
                node = node.getNext();
                j++;
            }
        }
        System.out.println(i);
        System.out.println(node);
        return (E) node;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.toArray());
    }

    @Override
    public Object set(int i, Object o) {
        this.add(i, o);
        return o;
    }

    @Override
    public void add(int i, Object o) {

        Node<E> node;
        Node<E> newNode = new Node<E>((E) o);

            if (i == 0) {
                newNode.setNext(this.head);
                this.head.setPrevious(newNode);
                this.head = newNode;
            } else if(i == this.size){
                newNode.setPrevious(this.tail);
                this.tail.setNext(newNode);
                this.tail = newNode;
            } else {
                node = (Node<E>) this.get(i);
                newNode.setPrevious(node);
                newNode.setNext(node.getNext());
                node.getNext().setPrevious(newNode);
                node.setNext(newNode);
            }
        this.size++;
    }


    @Override
    public Object remove(int i) {
        Node<E> node = (Node<E>) this.get(i);
        this.remove(node);
        return node;
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
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int i) {
        return null;
    }

    @Override
    public List subList(int i, int i1) {
        return null;
    }

    @Override
    public boolean retainAll(Collection collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection collection) {
        return false;
    }

    @Override
    public boolean containsAll(Collection collection) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] objects) {
        return new Object[0];
    }
}


class Node<E> {
    private E value;
    private Node<E> next;
    private Node<E> previous;

    Node() {
        this.value = null;
        this.next = null;
        this.previous = null;
    }

    Node(E value) {
        this.value = value;
        this.next = null;
        this.previous = null;
    }

    public Node(E value, Node<E> next, Node<E> previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public Node<E> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<E> previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}
