package com.github.hcsp.datastructure;

public class Queue {

    private Integer[] data;
    private Integer front;
    private Integer tail;
    private Integer size;

    public Queue() {
        this.front = 0;
        this.tail = 0;
        this.size = 0;
        this.data = new Integer[10];
    }

    public Queue(int initSize) {
        if (initSize <= 0) {
            throw new IllegalArgumentException("队列的初始长度应至少为1");
        }
        this.front = 0;
        this.tail = 0;
        this.size = 0;
        this.data = new Integer[initSize];
    }

    // 将一个元素添加到队列尾部
    public void add(int value) {
        if (size == data.length) {
            throw new ArrayIndexOutOfBoundsException("队列已满");
        }
        data[tail] = value;
        tail = tail == data.length - 1 ? 0 : tail + 1;
        size++;
    }

    // 将一个元素从队列头部移走
    public int remove() {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException("队列为空");
        }
        Integer res = data[front];
        front = front == data.length - 1 ? 0 : front + 1;
        size--;
        return res;
    }
}
