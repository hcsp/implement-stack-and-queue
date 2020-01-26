package com.github.hcsp.datastructure;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> elements;

    public Stack() {
        this.elements = new ArrayList<>();
    }

    // 将一个元素压入栈内
    public void push(int value) {
        elements.add(value);
    }

    // 从栈顶弹出一个元素
    public int pop() {
        return elements.remove(elements.size() - 1);
    }
}
