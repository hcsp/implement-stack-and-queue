package com.github.hcsp.datastructure;

public class Queue {
    private int capacity = 10;
    private int[] arr = new int[capacity];
    private int start = 0;
    private int end = 0;

    // 将一个元素添加到队列尾部
    public void add(int value) {
        arr[end] = value;
        end++;
    }

    // 将一个元素从队列头部移走
    public int remove() {
        int value = arr[start];
        start++;
        return value;
    }
}
