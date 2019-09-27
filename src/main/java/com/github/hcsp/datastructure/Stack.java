package com.github.hcsp.datastructure;

public class Stack {
    private int maxSize = 100;
    private int[] stackArray;
    private int top = -1;

    public Stack() {
        stackArray=new int[maxSize];
    }

    // 将一个元素压入栈内
    public void push(int value) {
        stackArray[++top] = value;
    }

    // 从栈顶弹出一个元素
    public int pop() {
        return stackArray[top--];
    }
}
