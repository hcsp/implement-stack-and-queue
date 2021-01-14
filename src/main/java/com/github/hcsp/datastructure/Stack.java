package com.github.hcsp.datastructure;

import java.util.LinkedList;

public class Stack {
    LinkedList<Integer> list =  new LinkedList<>();

    // 将一个元素压入栈内
    public void push(int value) {
        list.add(value);
    }

    // 从栈顶弹出一个元素
    public int pop() {
        return list.removeLast();
    }
}
