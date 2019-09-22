package edu.codeschool.training.classes_objects.homework_19_Maps;

import java.util.*;
import java.util.stream.Collectors;

class MyHashMap<K, V> implements java.util.Map<K, V> {
    // MyHashMap fields
    private final int INITIAL_CAPACITY = 16;
    private MyEntry<K, V>[] buckets = new MyEntry[INITIAL_CAPACITY];
    private int size = 0;

    //MyHashMap default costructor
    public MyHashMap() {
        this.buckets = new MyEntry[INITIAL_CAPACITY];
    }

    private static class MyEntry<K, V> implements Map.Entry<K, V> {

        private final K key;
        private V value;
        private MyEntry<K, V> next;

        public MyEntry(K key, V value) {
            this.key = key;
            this.value = value;

        }

        @Override
        public K getKey() {
            return this.key;
        }

        @Override
        public V getValue() {
            return this.value;
        }

        @Override
        public V setValue(V value) {
            V oldValue = this.value;
            this.value = value;
            return oldValue;
        }

        @Override
        public String toString() {
            return this.key + " , " + this.value;
        }
    }

    @Override
    public V put(K key, V value) {

        MyEntry<K, V> myEntry = new MyEntry<>(key, value);
        int hash = getHash(key);
        buckets[hash] = myEntry;
        MyEntry<K, V> current = buckets[hash];
        if (current == null) {
            buckets[hash] = myEntry;
            size++;
            return value;
        } else {
            while (current.next != null) {
                if (current.key.equals(key)) {
                    return current.setValue(value);
                }
                current = current.next;
            }
            if (current.key.equals(key)) {
                return current.setValue(value);
            } else {
                current = myEntry;
                size++;
                return value;
            }
        }
    }

    @Override
    public V get(Object key) {
        MyEntry<K, V> myEntry = buckets[getHash(key)];
        while (myEntry != null) {
            if (myEntry.key.equals(key)) {
                return myEntry.value;
            }
            myEntry = myEntry.next;
        }
        return null;
    }

    @Override
    public V remove(Object key) {
        MyEntry<K, V> myEntry = buckets[getHash(key)];
        while (myEntry != null) {
            MyEntry<K, V> previous = myEntry;
            if (myEntry.key.equals(key)) {
                if (myEntry.next == null) {
                    myEntry = null;
                    size--;
                    return previous.getValue();
                } else {
                    previous = myEntry.next;
                    size--;
                    return myEntry.getValue();
                }

            } else {
                previous = myEntry.next;
            }
        }
        return null;
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
    public boolean containsKey(Object key) {
        MyEntry<K, V> myEntry = buckets[getHash(key)];
        while (myEntry != null) {
            if (myEntry.key.equals(key)) {
                return true;
            }
            myEntry = myEntry.next;
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        if (size != 0) {
            for (MyEntry<K, V> myEntry : buckets) {
                if (myEntry.getValue().equals(value)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void clear() {
        for (MyEntry<K, V> myEntry : buckets) {
            myEntry = null;
        }
        size = 0;
    }

    @Override
    public Set<K> keySet() {
        Set<K> keys = new HashSet<>();
        for (MyEntry<K, V> myEntry : buckets) {
            keys.add(myEntry.key);
        }
        return keys;
    }

    @Override
    public Collection<V> values() {
        Collection<V> values = new LinkedList<>();
        for (MyEntry<K, V> myEntry : buckets) {
            values.add(myEntry.value);
        }
        return values;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {
        Set<? extends K> keys = m.keySet();
        for (K key : keys) {
            this.put(key, m.get(key));
        }
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        Set<Entry<K, V>> entrySet=new HashSet<>();
        for (MyEntry myEntry :buckets) {
            entrySet.add(myEntry);
        }
        return entrySet;
    }

    private int getHash(Object key) {
        int hash = key.hashCode();
        int index = hash % INITIAL_CAPACITY;
        return index;
    }

}

