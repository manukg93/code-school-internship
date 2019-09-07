package edu.codeschool.training.collections.homework17;

class Node<E> {
    private E value;
    private Node<E> link;

    Node() {
        this.value = null;
        this.link = null;
    }

    Node (E value) {
        this.value = value;
        this.link = null;
    }

    void setValue (E value) {
        this.value = value;
    }

    void setLink(Node<E> link) {
        this.link = link;
    }

    E getValue() {
        return this.value;
    }

    Node<E> getLink() {
        return this.link;
    }

}
