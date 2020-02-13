package com.github.hcsp.datastructure;

public class Queue {
    private Object[] queue;
    private int head;
    private int tail;
    private int count;

    public Queue() {
        queue = new Object[10];
        this.head = 0;
        this.tail = 0;
        this.count = 0;
    }

    public Queue(int size) {
        queue = new Object[size];
        this.head = 0;
        this.tail = 0;
        this.count = 0;
    }

    public void add(int value) {
        //如果不为空就放入下一个
        queue[tail++ % (queue.length)] = value;
        count++;
    }

    public int remove() {
        if (count == 0) {
            throw new IndexOutOfBoundsException("Queue empty");
        }
        count--;
        return (int) queue[head++ % (queue.length)];
    }
}
