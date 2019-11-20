package com.github.hcsp.datastructure;

public class Stack {

    private int top = -1;

    private int max_size = 16;

    private int size;

    private Object[] data;

    public Stack() {
        data = new Object[max_size];
    }

    // 将一个元素压入栈内
    public void push(int value) {
        if (size == max_size) {
            throw new RuntimeException("栈满了");
        } else {
            data[++top] = value;
            size++;
        }
    }

    // 从栈顶弹出一个元素
    public int pop() {
        if (top == -1) {
            throw new RuntimeException("栈空了");
        } else {
            size--;
            return (int) data[top--];
        }
    }
}
