package com.github.hcsp.datastructure;

public class Stack {
    private final Object[] elements;
    private int tail;

    public Stack() {
        this.elements = new Object[16];
        this.tail = 0;
    }

    // 将一个元素压入栈内
    public void push(int value) {
        this.elements[tail++] = value;
    }

    // 从栈顶弹出一个元素
    public int pop() {
        if (tail <= 0) {
            return -1;
        }
        Object result = elements[tail - 1];
        elements[tail--] = null;
        return (int) result;
    }
}
