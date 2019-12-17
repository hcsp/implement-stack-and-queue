package com.github.hcsp.datastructure;

public class Stack {
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

    // 将一个元素压入栈内
    public void push(int value) {
        if (capacity - count < 1) {
            resize();
        }
        arr[count] = value;
        count++;
    }

    // 从栈顶弹出一个元素
    public int pop() {
        if (count < 1) {
            throw new RuntimeException("stack is empty!");
        }
        int[] temp = new int[capacity];
        int removeEl = arr[count - 1];
        System.arraycopy(arr, 0, temp, 0, count - 1);
        arr = temp;
        count--;
        return removeEl;
    }
}
