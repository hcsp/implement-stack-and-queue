package com.github.hcsp.datastructure;

public class Queue {
    private int[] intQueue;
    private final int capacity = 100;
    private int size;
    private int start;
    private int end;

    public Queue(){
        intQueue = new int[capacity];
        size = 0;
        start = 0;
        end = 0;
    }
    // 将一个元素添加到队列尾部
    public void add(int value) {
        end = (start + size) % intQueue.length;
        intQueue[end] = value;
        size++;
    }

    // 将一个元素从队列头部移走
    public int remove() {
        int value = intQueue[start];
        start = (start + 1) % intQueue.length;
        size--;
        return value;
    }
}
