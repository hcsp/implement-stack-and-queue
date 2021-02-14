package com.github.hcsp.datastructure;

import java.util.LinkedList;

public class Stack {
    // 将一个元素压入栈内
    LinkedList<Integer> stack = new LinkedList<>();

    public void push(int value) {
        stack.add(value);
    }

    // 从栈顶弹出一个元素
    public int pop() {
        return stack.pollLast();
    }
}
