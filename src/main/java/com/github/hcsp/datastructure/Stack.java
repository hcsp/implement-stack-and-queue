package com.github.hcsp.datastructure;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Integer> elements;

    public Stack() {
        elements = new ArrayList<>();
    }

    // 将一个元素压入栈内
    public void push(int value) {
        elements.add(value);
    }

    // 从栈顶弹出一个元素
    public int pop() {
        int tail = elements.size() - 1;
        return elements.remove(tail);
    }
}
