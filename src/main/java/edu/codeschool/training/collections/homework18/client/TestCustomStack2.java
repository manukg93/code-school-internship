package edu.codeschool.training.collections.homework18.client;

import edu.codeschool.training.collections.homework18.CustomStack2;
import edu.codeschool.training.collections.homework18.StackIsEmptyException;

public class TestCustomStack2 {
    public static void main(String[] args) {
        CustomStack2<String> stack2 = new CustomStack2<>();
        stack2.push("A");
        stack2.push("AA");
        stack2.push("AAA");
        stack2.push("AAAA");
        stack2.push("AAAAA");
        System.out.println(stack2.empty());

        try {
            System.out.println(stack2.peek());
            System.out.println();
            System.out.println(stack2.pop());
            System.out.println(stack2.pop());
            System.out.println(stack2.pop());
            System.out.println(stack2.pop());
            System.out.println(stack2.pop());
            System.out.println(stack2.pop());
            System.out.println(stack2.pop());
            System.out.println(stack2.pop());
            System.out.println(stack2.pop());
        } catch (StackIsEmptyException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
