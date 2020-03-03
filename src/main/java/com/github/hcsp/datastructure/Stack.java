package com.github.hcsp.datastructure;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    // 将一个元素压入栈内
    List<Integer> list = new ArrayList<>();

    public void push(int value) {
        list.add(value);
    }

    // 从栈顶弹出一个元素
    public int pop() {
        int value = list.get(list.size() - 1);
        list.remove(value);
        return value;
    }
}
