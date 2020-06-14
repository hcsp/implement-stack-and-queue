package com.github.hcsp.datastructure;

import java.util.ArrayList;

public class Stack {

    ArrayList<Integer> arrays = new ArrayList<>();

    // 将一个元素压入栈内
    public void push(int value) {
        arrays.add(value);
    }

    // 从栈顶弹出一个元素
    public int pop() {
        return arrays.remove(arrays.size() - 1);
    }
}
