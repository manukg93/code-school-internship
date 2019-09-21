package edu.codeschool.training.homework18.client;
import edu.codeschool.training.homework18.exercise1.StackLinkedList;
import java.util.Stack;

public class TestStackLinkedList {
    public static void main(String[] args) {
//        Stack<String> stack = new Stack<>();
        Stack<String> stack = new StackLinkedList<>();
        System.out.println(stack.empty());


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
