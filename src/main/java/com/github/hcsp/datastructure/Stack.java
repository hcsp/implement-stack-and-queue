package com.github.hcsp.datastructure;

import java.util.Arrays;

public class Stack {
    private int[] elements;

    public Stack() {
        this.elements = new int[0];
    }

    // 将一个元素压入栈内
    public void push(int value) {
        int[] newArray = new int[elements.length + 1];
        System.arraycopy(elements, 0, newArray, 0, elements.length);
        newArray[elements.length] = value;
        elements = newArray;
    }

    // 从栈顶弹出一个元素
    public int pop() {
        int tail = elements[elements.length - 1];
        elements = Arrays.copyOf(elements,
                elements.length - 1);
        return tail;
    }
}
