package com.github.hcsp.datastructure;


public class Stack {
    private final int size = 1000;
    private int[] stackArray;
    private int stackTop = -1;

    public Stack() {
        stackArray = new int[size];
    }
    // 将一个元素压入栈内
    public void push(int value) {
        if (stackTop == size - 1) {
            System.err.println("The stack is full and the value is discarded!");
        }else {
            stackArray[++stackTop] = value;
        }
    }

    // 从栈顶弹出一个元素
    public int pop() {
        if (stackTop == -1) {
            System.err.println("The stack is empty and nothing to pop!");
            return -999999999;
        }else {
            return stackArray[stackTop--];
        }

    }
}
