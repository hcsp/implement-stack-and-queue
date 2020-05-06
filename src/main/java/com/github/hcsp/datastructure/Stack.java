package com.github.hcsp.datastructure;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {
    // 将一个元素压入栈内
    Deque<Integer> stack = new ArrayDeque<Integer>();

    public void push(int value) {
        stack.push(value);
    }

    // 从栈顶弹出一个元素
    public int pop() {
        return stack.pop();
    }
}
