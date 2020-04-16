package com.github.hcsp.datastructure;

import java.util.Arrays;

public class Queue {

    private int tail = -1;//-1表示为空栈

    private int capacity = 8;//默认容量为8

    private int[] array;//存放数据

    public Queue() {
        array = new int[capacity];
    }

    // 将一个元素添加到队列尾部
    public void add(int value) {
        //array[head] = value;
        if (++tail >= capacity) {
            capacity <<= 1;
            array = Arrays.copyOf(array, capacity);
        }
        array[tail] = value;

    }

    // 将一个元素从队列头部移走
    public int remove() {
        int head = array[0];
        array = Arrays.copyOfRange(array, 1, tail + 1);
        tail--;
        return head;
    }
}
