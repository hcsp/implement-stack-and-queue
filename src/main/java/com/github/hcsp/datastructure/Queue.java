package com.github.hcsp.datastructure;



public class Queue {
    private int[] data;
    private int size;
    private int front;
    private int rear;


    public Queue() {
        data = (new int[10]);
        size = 0;
        front =0;
        rear = 0;

    }

    // 将一个元素添加到队列尾部
    public void add(int value) {
        rear = (front+size)%data.length;
        System.out.println(rear);
        data[rear] = value;
        size++;

    }

    // 将一个元素从队列头部移走
    public int remove() {
        int tempData = data[front];
        front = (front + 1) % (data.length);
        size--;
        return tempData;

    }
}
