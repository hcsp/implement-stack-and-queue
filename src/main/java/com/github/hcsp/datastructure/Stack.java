package com.github.hcsp.datastructure;

public class Stack {
    // 将一个元素压入栈内
    private int[] arr = new int[Integer.MAX_VALUE];
    private int top = 0;

    public void push(int value) {
        arr[top++] = value;
    }

    // 从栈顶弹出一个元素
    public int pop() {
        return arr[top--];
    }
}
