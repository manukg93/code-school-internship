package edu.codeschool.training.collections.homework17.linked_list;

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

    // setters
    void setValue (E value) {
        this.value = value;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public void setPrevious(Node<E> previous) {
        this.previous = previous;
    }

    // getters
    E getValue() {
        return this.value;
    }

    public Node<E> getNext() {
        return this.next;
    }

    public Node<E> getPrevious() {
        return this.previous;
    }
}
