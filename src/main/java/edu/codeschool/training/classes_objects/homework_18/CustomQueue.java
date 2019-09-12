package edu.codeschool.training.classes_objects.homework_18;


import java.util.ArrayList;
import java.util.NoSuchElementException;

public class CustomQueue<E> {
    // using ArrayList
    private ArrayList<E> queue = new ArrayList<>();

    //This method is used to add elements at the tail of queue.
    public boolean add(E e) {
        if (e.equals(null)) {
            throw new NullPointerException("Element must be not null");
        } else {
            queue.add(e);
            return true;
        }
    }

    //return true if the element was added to this queue, else return false.
    public boolean offer(E e) {
        if (e.equals(null)) {
            return false;
        } else {
            queue.add(e);
            return true;
        }
    }

    //This method is used to view the head of queue without removing it. It returns Null if the queue is empty.
    public E peek() {
        if (queue.size() == 0) {
            return null;
        } else {
            return queue.get(0);
        }
    }
        //This method removes and returns the head of the queue.
        // It throws NoSuchElementException when the queue is empty.
        public E remove () {
            E headElement;
            if (queue.size() == 0) {
                throw new NoSuchElementException("This queue is empty");
            } else {
                headElement = queue.get(0);
                queue.remove(0);
                return headElement;
            }
        }

        //return the head of this queue, or  null if this queue is empty
        public E poll () {
            E headElement;
            if (queue.size() == 0) {
                return null;
            } else {
                headElement = queue.get(0);
                queue.remove(queue.get(0));
                return headElement;
            }
        }

        //This method is similar to peek(). It throws NoSuchElementException when the queue is empty.
        public E element () {
            if (queue.size() == 0) {
                throw new NoSuchElementException("This queue is empty.");
            } else {
                return queue.get(0);
            }
        }

    @Override
    public String toString() {
        return queue.toString();
    }
}