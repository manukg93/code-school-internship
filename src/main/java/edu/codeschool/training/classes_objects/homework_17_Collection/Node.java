package edu.codeschool.training.classes_objects.homework_17_Collection;


public class Node<T> {
    T element;
    Node<T> next;
    Node<T> prev;

    public Node(T element) {
        this.element = element;
        this.next=null;
        this.prev=null;
    }

    public Node(T element, Node<T> next, Node<T> prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    @Override
    public String toString() {
        return "Node{" +
                "element=" + this.element +
                ", next=" + this.next +
                ", prev=" + this.prev +
                '}';
    }
}
