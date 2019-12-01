package com.github.hcsp.datastructure;

public class Queue {
    // 将一个元素添加到队列尾部
    private int[] arr = new int[Integer.MAX_VALUE];
    int size = arr.length;
    int start = 0;
    int end = 0;

    public void add(int value) {
        end = (end+1) % size;
        arr[end] = value;
    }

    // 将一个元素从队列头部移走
    public int remove() {
        int res = arr[start];
        start = (start+1) % size;
        return res;
    }
}
