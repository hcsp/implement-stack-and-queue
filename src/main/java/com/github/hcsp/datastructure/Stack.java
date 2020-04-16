package com.github.hcsp.datastructure;

import java.util.Arrays;

public class Stack {

    private int top = -1;//-1表示为空栈

    private int capacity = 8;//默认容量为8

    private int[] array;//存放数据

    public Stack() {
        this.array = new int[capacity];
    }

    // 将一个元素压入栈内
    public void push(int value) {
        //如果超出容量，扩容
        if (++top >= capacity) {
            capacity <<= 1;
            array = Arrays.copyOf(array, capacity);
        }
        array[top] = value;
    }

    // 从栈顶弹出一个元素
    public int pop() {
        int pop = array[top];
        array = Arrays.copyOf(array, top--);
        capacity = array.length;
        return pop;
    }
}
