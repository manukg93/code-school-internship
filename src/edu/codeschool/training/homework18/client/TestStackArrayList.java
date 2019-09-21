package edu.codeschool.training.homework18.client;

import edu.codeschool.training.homework18.exercise1.StackArrayList;
import java.util.Stack;

public class TestStackArrayList {
    public static void main(String[] args) {
//        Stack<String> stack = new Stack<>();
        Stack<String> stack = new StackArrayList<>();
        stack.push("AA");
        stack.push("BB");
        stack.push("CC");

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.search("BB"));
        System.out.println(stack.empty());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

    }
}
