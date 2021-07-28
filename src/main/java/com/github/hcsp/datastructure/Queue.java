package com.github.hcsp.datastructure;

public class Queue {
    private final Object[] elements;
    private int head;
    private int tail;

    public Queue() {
        this.elements = new Object[16];
        this.head = 0;
        this.tail = 0;
    }

    // 将一个元素添加到队列尾部
    public void add(int value) {
        elements[tail++] = value;
    }

    // 将一个元素从队列头部移走
    public int remove() {
        if (head == tail) {
            return -1;
        }
        Object result = elements[head];
        elements[head++] = null;
        return (int) result;
    }
}
