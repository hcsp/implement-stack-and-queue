package com.github.hcsp.datastructure;

public class Stack {
    private Object[] data;
    private int maxSize;   //栈容量
    private int top;  //栈顶指针


    public Stack() {
        this(10);
    }

    Stack(int initialSize) {
        if (initialSize >= 0) {
            this.maxSize = initialSize;
            data = new Object[initialSize];
            top = -1;
        } else {
            throw new RuntimeException("初始化大小不能小于0：" + initialSize);
        }
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            throw new IndexOutOfBoundsException("栈已满，无法将元素入栈！");
        } else {
            data[++top] = value;
        }
    }


    public int pop() {
        if (top == -1) {
            throw new RuntimeException("栈为空！");
        } else {
            return (int) data[top--];
        }
    }
}
