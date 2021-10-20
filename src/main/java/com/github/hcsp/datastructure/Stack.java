package com.github.hcsp.datastructure;

public class Stack {
    java.util.Stack<Integer> stack = new java.util.Stack<>();

    // 将一个元素压入栈内
    public void push(int value) {
        stack.push(value);
    }

    // 从栈顶弹出一个元素
    public int pop() {
        return stack.pop();
    }
}
