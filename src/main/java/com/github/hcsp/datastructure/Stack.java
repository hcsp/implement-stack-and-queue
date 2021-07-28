package com.github.hcsp.datastructure;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private final List<Integer> container;

    public Stack() {
        this.container = new ArrayList<>();
    }

    // 将一个元素压入栈内
    public void push(int value) {
        container.add(value);
    }

    // 从栈顶弹出一个元素
    public int pop() {
        return container.size() > 0 ? container.remove(container.size() - 1) : -1;
    }
}
