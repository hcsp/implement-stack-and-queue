package com.github.hcsp.datastructure;

import java.util.Arrays;

public class Stack {
    int[] elements;
    int count;
    int size;

    public Stack() {
        size = 8;
        elements = new int[size];
        count = 0;
    }

    // 将一个元素压入栈内
    public void push(int value) {
        if (count == size) {
            size = size << 2;
            int[] tmp = elements;
            elements = Arrays.copyOf(tmp, size);
        }
        elements[count] = value;
        count++;
    }

    // 从栈顶弹出一个元素
    public int pop() {
        if (count == 0) {
            throw new RuntimeException("当前栈为空，无元素弹出");
        }
        int result = elements[count - 1];
        count--;
        return result;
    }
}
