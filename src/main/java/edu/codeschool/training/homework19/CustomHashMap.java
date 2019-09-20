package edu.codeschool.training.homework19;

import java.util.Map;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
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
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            Node<K, V> nd = this.hashTable.get(i);
            if (nd == null) {
                continue;
            }
            if (nd.getKey().equals(key)) {
                this.hashTable.set(i, nd.getNext());
                nd.setNext(null);
                this.capacity--;
                return nd.getValue();
            }
            while (nd.getNext() != null) {
                Node<K, V> next = nd.getNext();
                if (next.getKey().equals(key)) {
                    nd.setNext(next.getNext());
                    next.setNext(null);
                    this.capacity--;
                    return next.getValue();
                }
                nd = nd.getNext();
            }
        }
        return null;
    }

    @Override
    public void putAll(Map m) {
        Set<K> keys = m.keySet();
        for ( K key : keys ) {
            this.put(key, (V) m.get(key));
        }
    }

    @Override
    public void clear() {
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            this.hashTable.set(i, null);
        }
        this.capacity = 0;
    }

    @Override
    public Set<K> keySet() {
        Set<K> keys = new HashSet<>();
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            Node<K, V> nd = this.hashTable.get(i);
            if (nd == null) {
                continue;
            }
            keys.add(nd.getKey());
            while (nd.getNext() != null) {
                nd = nd.getNext();
                keys.add(nd.getKey());
            }
        }
        return keys;
    }

    @Override
    public Collection<V> values() {
        Collection<V> values = new ArrayList<>();
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            Node<K, V> nd = this.hashTable.get(i);
            if (nd == null) {
                continue;
            }
            values.add(nd.getValue());
            while (nd.getNext() != null) {
                nd = nd.getNext();
                values.add(nd.getValue());
            }
        }
        return values;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> nodes = new HashSet<>();
        for (int i = 0; i < INITIAL_CAPACITY; i++) {
            Node<K, V> nd = this.hashTable.get(i);
            if (nd == null) {
                continue;
            }
            nodes.add(nd);
            while (nd.getNext() != null) {
                nd = nd.getNext();
                nodes.add(nd);
            }
        }
        return nodes;
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
            map.append(nd.toString()).append(", ");
            while (nd.getNext() != null) {
                nd = nd.getNext();
                map.append(nd.toString()).append(", ");
            }
        }
        map.append("]");
        return map.toString();
    }
}
