package com.github.hcsp.datastructure;


public class Stack {

    private Integer[] data;
    private Integer size;

    public Stack() {
        this.size = 0;
        this.data = new Integer[10];
    }

    public Stack(int initSize) {
        if (initSize <= 0) {
            throw new IllegalArgumentException("栈的初始长度至少应为1");
        }
        this.size = 0;
        this.data = new Integer[initSize];
    }

    // 将一个元素压入栈内
    public void push(int value) {
        if (size == data.length) {
            throw new ArrayIndexOutOfBoundsException("栈已满");
        }
        this.data[size++] = value;
    }

    // 从栈顶弹出一个元素
    public int pop() {
        if (size == 0) {
            throw new ArrayIndexOutOfBoundsException("栈已空");
        }
        return this.data[--size];
    }
}
