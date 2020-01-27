package com.github.hcsp.datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class Stack {

    Queue<Integer> queue;

    public Stack() {
        queue = new LinkedList<>();
    }

    // 将一个元素压入栈内
    public void push(int value) {
        queue.offer(value);
        int size = queue.size();

        while (size-- > 1) {
            queue.offer(queue.poll());
        }
    }

    // 从栈顶弹出一个元素
    public int pop() {
        return queue.poll();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);


    }
}
