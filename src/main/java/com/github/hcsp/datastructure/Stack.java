package com.github.hcsp.datastructure;

import java.util.ArrayList;

public class Stack {
    ArrayList<Integer> arr = new ArrayList<>();
    // 将一个元素压入栈内
    public void push(int value) {
        arr.add(value);
    }

    // 从栈顶弹出一个元素
    public int pop() {
        return arr.remove(arr.size() - 1);
    }
}
