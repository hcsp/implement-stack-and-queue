package com.github.hcsp.datastructure;

public class Stack {
    private int capacity = 10;
    private int[] arr = new int[capacity];
    private int index = 0;
    // 将一个元素压入栈内
    public void push(int value) {
        arr[index] = value;
        index++;
    }

    // 从栈顶弹出一个元素
    public int pop() {
        int value = arr[index - 1];
        index--;
        return value;
    }
}
