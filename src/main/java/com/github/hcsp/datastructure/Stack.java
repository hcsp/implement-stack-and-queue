package com.github.hcsp.datastructure;

import java.util.LinkedList;
import java.util.List;

public class Stack {
    private final List<Integer> value = new LinkedList<>();
    int top = 0;

    // 将一个元素压入栈内
    public void push(int value) {
        this.value.add(top++, value);
    }

    // 从栈顶弹出一个元素
    public int pop() {
        return this.value.get(--top);
    }
}
