package com.github.hcsp.datastructure;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Integer> container = new ArrayList<>();

    public List<Integer> getContainer() {
        return container;
    }

    public void setContainer(List<Integer> container) {
        this.container = container;
    }

    // 将一个元素压入栈内
    public void push(int value) {
        List<Integer> container = getContainer();
        container.add(value);
        setContainer(container);
    }

    // 从栈顶弹出一个元素
    public int pop() {
        List<Integer> container = getContainer();
        int value = container.size() > 0 ? container.remove(container.size() - 1) : -1;
        setContainer(container);
        return value;
    }
}
