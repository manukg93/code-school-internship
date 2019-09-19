package edu.codeschool.training.homework19;

import com.sun.xml.internal.bind.marshaller.NoEscapeHandler;

import java.util.Map;
import java.util.ArrayList;
import java.util.Set;
import java.util.Collection;

public class CustomHashMap<K, V> implements Map<K, V> {
    private static final int INITIAL_CAPACITY = 16;
//    private static final double LOAD_FACTOR = 0.75;

    private int capacity;
    private ArrayList<Node<K, V>> hashTable;

    // CustomHashMap constructor
    public CustomHashMap() {
        this.hashTable = new ArrayList<>(INITIAL_CAPACITY);
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            this.hashTable.add(null);
        }
        this.capacity = 0;
    }

    @Override
    public int size() {
        return this.capacity;
    }

    @Override
    public boolean isEmpty() {
        return this.capacity == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        int len = this.hashTable.size();
        for (int i = 0; i < len; i++) {
            Node<K, V> nd = this.hashTable.get(i);
            if (nd == null) {
                continue;
            }
            if (nd.getKey().equals(key)) {
                return true;
            }
            while (nd.getNext() != null) {
                nd = nd.getNext();
                if (nd.getKey().equals(key)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        int len = this.hashTable.size();
        for (int i = 0; i < len; i++) {
            Node<K, V> nd = this.hashTable.get(i);
            if (nd == null) {
                continue;
            }
            if (nd.getValue().equals(value)) {
                return true;
            }
            while (nd.getNext() != null) {
                nd = nd.getNext();
                if (nd.getValue().equals(value)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public V get(Object key) {
        int len = this.hashTable.size();
        for (int i = 0; i < len; i++) {
            Node<K, V> nd = this.hashTable.get(i);
            if (nd == null) {
                continue;
            }
            if (nd.getKey().equals(key)) {
                return nd.getValue();
            }
            while (nd.getNext() != null) {
                nd = nd.getNext();
                if (nd.getKey().equals(key)) {
                    return nd.getValue();
                }
            }
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        int index = Node.hash(key);
        if (this.hashTable.get(index) == null) {
            this.hashTable.set(index, new Node<>(index, key, value));
            this.capacity++;
            return null;
        }
        Node<K, V> nd = this.hashTable.get(index);
        while (nd != null) {
            if (nd.getKey().equals(key)) {
                V oldValue = nd.getValue();
                nd.setValue(value);
                return oldValue;
            }
            if (nd.getNext() == null) {
                nd.setNext(new Node<>(index, key, value));
                this.capacity++;
                return null;
            }
            nd = nd.getNext();
        }
        return null;
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        return null;
    }

    @Override
    public String toString() {
        int len = this.hashTable.size();
        StringBuilder map = new StringBuilder("[");
        for (int i = 0; i < len; i++) {
            Node<K, V> nd = this.hashTable.get(i);
            if (nd == null) {
                continue;
            }
            map.append(nd.toString()).append(" ");
            while (nd.getNext() != null) {
                nd = nd.getNext();
                map.append(nd.toString()).append(" ");
            }
        }
        map.append("]");
        return map.toString();
    }
}
