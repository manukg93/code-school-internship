package homework19;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo<E> implements Set<E> {
    private HashMap<E, Object> map;
    private static final Object PRESENT = new Object();

    public HashSetDemo() {
        map = new HashMap<>();
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    @Override
    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    @Override
    public Object[] toArray() {

        return map.keySet().toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(E e) {
        return map.put(e, PRESENT) == null;

    }

    @Override
    public boolean remove(Object o) {
        return map.remove(o) == PRESENT;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        if (size() > c.size()) {
            for (Object el : c) ;

        }

        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        if (size() > c.size()) {
            for (E el : c) {
                this.add(el);
            }
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {

        this.removeAll(c);
        if (size() == this.map.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        for (Object el : c) {
            if (map.containsKey(el)) {
                map.remove(el);
            } else {
                return false;
            }

        }return true;
    }


    @Override
    public void clear() {
        map.clear();;
    }
}
