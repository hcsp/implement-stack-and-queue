package com.github.hcsp.datastructure;

public class Queue {
    private int capacity = 50;
    private int count = 0;
    private int[] arr = new int[capacity];

    public void resize() {
        int newCapacity = capacity * 2;
        int[] temp = new int[newCapacity];

        System.arraycopy(arr, 0, temp, 0, capacity - 1);

        capacity = newCapacity;
        arr = temp;
    }

    // 将一个元素添加到队列尾部
    public void add(int value) {
        if (capacity - count < 1) {
            resize();
        }
        arr[count] = value;
        count++;
    }

    // 将一个元素从队列头部移走
    public int remove() {
        if (count < 1) {
            throw new RuntimeException("queue is empty!");
        }
        int[] temp = new int[capacity];
        int removeEl = arr[0];
        System.arraycopy(arr, 1, temp, 0, count - 1);
        arr = temp;
        count--;
        return removeEl;
    }
}
