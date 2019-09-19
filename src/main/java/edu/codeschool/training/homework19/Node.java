package edu.codeschool.training.homework19;

import java.util.Map;

class Node<K, V> implements Map.Entry<K, V> {

    final int hash;
    final K key;
    V value;
    Node<K, V> next;

    // Node constructor
    Node(int hash, K key, V value) {
        this.hash = hash;
        this.key = key;
        this.value = value;
        this.next = next;
    }

    public final K getKey() {
        return this.key;
    }
    public final V getValue() {
        return this.value;
    }
    public final V setValue(V newValue) {
        V oldValue = this.value;
        this.value = newValue;
        return oldValue;
    }
    public void setNext(Node<K, V> next) {
        this.next = next;
    }
    public Node<K, V> getNext() {
        return this.next;
    }

    public final int hashCode() {
        return this.key.hashCode() ^ this.value.hashCode();
    }

    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : Math.abs(((h = key.hashCode()) ^ (h >>> 16)) % 16);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof Node) {
            Node<?, ?> node = (Node<?, ?> )object;
            if (node.getKey().equals(this.key) &&
                    node.getValue().equals(this.value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return this.key + " = " + this.value;
    }

}
