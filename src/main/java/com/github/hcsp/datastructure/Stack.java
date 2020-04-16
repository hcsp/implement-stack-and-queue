package com.github.hcsp.datastructure;

import java.util.Arrays;

public class Stack {

    private int top = -1;

    private int capacity = 8;

    private int[] array;

    public Stack() {
        this.array = new int[capacity];
    }

    // 将一个元素压入栈内
    public void push(int value) {
        ensureCapacity();
        array[top] = value;
    }

    private void ensureCapacity() {
        if (++top >= capacity) {
            capacity <<= 1;
            array = Arrays.copyOf(array, capacity);
        }
    }

    // 从栈顶弹出一个元素
    public int pop() {
        int pop = array[top];
        array = Arrays.copyOf(array, top--);
        capacity = array.length;
        return pop;
    }
}
