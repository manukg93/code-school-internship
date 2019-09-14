package edu.codeschool.training.collections.homework18.client;

import edu.codeschool.training.collections.homework18.ArrayQueue;

public class TestArrayQueue {
    public static void main(String[] args) {
        ArrayQueue<String> queue = new ArrayQueue<>(5);
        System.out.println(queue.offer("sun"));
        System.out.println(queue.add("sky"));
        System.out.println(queue.add("moon"));
        System.out.println(queue.add("planet"));
        System.out.println(queue.add("star"));

        System.out.println(queue.offer("st"));
        System.out.println(queue);

        System.out.println(queue.element());
        System.out.println(queue.element());
        System.out.println(queue.element());

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.peek());
        //System.out.println(queue.element());
        //System.out.println(queue.remove());


    }
}