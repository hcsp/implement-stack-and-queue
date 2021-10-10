package com.github.hcsp.datastructure;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {
    private Deque<Integer> stack = new ArrayDeque<>();
    // 将一个元素压入栈内
    public void push(int value) {
        stack.addLast(value);
    }

    // 从栈顶弹出一个元素
    public int pop() {
        return stack.removeLast();
    }
}
