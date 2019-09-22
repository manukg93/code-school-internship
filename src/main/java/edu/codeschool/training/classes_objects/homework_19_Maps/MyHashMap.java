package edu.codeschool.training.classes_objects.homework_19_Maps;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

class MyHashMap<K, V> implements java.util.Map<K, V> {
        // MyHashMap fields
        private final int INITIAL_CAPACITY = 16;
        private MyEntry<K, V>[] buckets=new MyEntry[INITIAL_CAPACITY];
        private int size=0;

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

        }

        @Override
        public V put(K key, V value) {

            MyEntry<K,V> myEntry=new MyEntry<>(key,value);
            int hash=getHash(key);
            buckets[hash]=myEntry;
            MyEntry<K,V> current=buckets[hash];
            if (current==null) {
                buckets[hash]=myEntry;
                size++;
                return value;
            }else{
                while(current.next!=null){
                    if(current.key.equals(key)){
                        return current.setValue(value);
                    }
                    current=current.next;
                }
                if(current.key.equals(key)){
                    return current.setValue(value);
                }else{
                    current=myEntry;
                    size++;
                    return value;
                }
            }
        }

        @Override
        public V get(Object key) {
            MyEntry<K,V> myEntry=buckets[getHash(key)];
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
            MyEntry<K,V> myEntry=buckets[getHash(key)];
            MyEntry<K,V> previous=myEntry;
            while(myEntry!=null){
                if (myEntry.key.equals(key) && myEntry.next!=null){
                    previous=myEntry.next;
                    myEntry.setValue(myEntry.getValue());
                    size--;
                }else if(myEntry.key.equals(key) && myEntry.next==null){
                    myEntry=null;
                    previous.setValue(myEntry.getValue());
                    size--;
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
            return size==0;
        }

        @Override
        public boolean containsKey(Object key) {
            return false;
        }

        @Override
        public boolean containsValue(Object value) {
            return false;
        }

        @Override
        public void putAll(Map<? extends K, ? extends V> m) {

        }

        @Override
        public void clear() {

        }

        @Override
        public Set<K> keySet() {
            return null;
        }

        @Override
        public Collection<V> values() {
            return null;
        }

        @Override
        public Set<Entry<K, V>> entrySet() {
            return null;
        }

        private int getHash(Object key){
            int hash= key.hashCode();
            int index=hash%INITIAL_CAPACITY;
            return index;
        }
}

