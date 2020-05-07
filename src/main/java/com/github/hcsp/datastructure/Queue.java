package com.github.hcsp.datastructure;

import java.util.Arrays;

public class Queue {
    private int[] elementData;
    private int size = 0;

    public Queue() {
        int initialCapacity = 1000;
        elementData = new int[initialCapacity];
    }

    // 将一个元素添加到队列尾部
    public void add(int value) {
        elementData[size] = value;
        size++;
    }

    // 将一个元素从队列头部移走
    public int remove() {
        if (size > 0) {
            int value = elementData[0];
            elementData = Arrays.copyOfRange(elementData, 1, size);
            size--;
            return value;
        }
        return -1;
    }
}
