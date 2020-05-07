package com.github.hcsp.datastructure;

import java.util.Arrays;

public class Stack {
    private int[] elementData = new int[1000];
    private int size = 0;

    // 将一个元素压入栈内
    public void push(int value) {
        elementData[size] = value;
        size++;
    }

    // 从栈顶弹出一个元素
    public int pop() {
        if (size > 0) {
            int value = elementData[size - 1];
            elementData = Arrays.copyOfRange(elementData, 0, size - 1);
            size--;
            return value;
        }
        return -1;
    }

}
