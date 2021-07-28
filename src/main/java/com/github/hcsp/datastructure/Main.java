package com.github.hcsp.datastructure;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(0);
        stack.push(1);
        stack.push(2);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        Queue queue = new Queue();
        queue.add(0);
        queue.add(1);
        queue.add(2);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
