package edu.codeschool.training.classes_objects.homework_18;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Vector;

public class CustomStack<E> extends Vector<E> {
    // using ArrayList
    private ArrayList<E> stack = new ArrayList<>();

    //Creates an empty Stack.
    public CustomStack() {
    }

    // Tests if this stack is empty.
    public boolean empty() {
        return stack.size() == 0;
    }

    //method returns the distance from the top of the stack of the, -1 indicates that the object is not on the stack.
    public synchronized int search(Object o) {
        int i = lastIndexOf(o);

        if (i >= 0) {
            return size() - i;
        }
        return -1;
    }

    //Pushes an item onto the top of this stack.
    public E push(E element) {
        stack.add(stack.size(), element);

        return element;
    }

    //Removes and returns the top element of the stack.
    // An ‘EmptyStackException’ exception is thrown if we call pop() when the invoking stack is empty.
    public synchronized E pop() {
        E element;
        element=peek();
        stack.remove(peek());
        return peek();


    }

    //Returns the element on the top of the stack, but does not remove it.
    public synchronized E peek() {
        if (size() == 0)
            throw new EmptyStackException();
        return stack.get(size() - 1);
    }

}
