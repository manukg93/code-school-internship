package edu.codeschool.training.collections.homework18.client;

import edu.codeschool.training.collections.homework18.CustomStack1;
import edu.codeschool.training.collections.homework18.StackIsEmptyException;

public class TestCustomStack1 {
    public static void main(String[] args) {
        CustomStack1<Double> stack1 = new CustomStack1<>();
        stack1.push(1.1);
        stack1.push(1.2);
        stack1.push(1.3);
        stack1.push(1.4);
        stack1.push(1.5);

        System.out.println( stack1.search(1.4));

        try {
            System.out.println(stack1.peek());
            System.out.println(stack1.peek());
            System.out.println(stack1.peek());
            System.out.println(stack1.peek());
            System.out.println(stack1.peek());
            System.out.println();

            System.out.println(stack1.pop());
            System.out.println(stack1.pop());
            System.out.println(stack1.pop());
            System.out.println(stack1.pop());
            System.out.println(stack1.pop());
            System.out.println(stack1.pop());
            System.out.println(stack1.pop());
        } catch (StackIsEmptyException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(stack1.empty());

    }
}
