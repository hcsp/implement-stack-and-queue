package com.github.hcsp.datastructure;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    private final List<Integer> container;

    public Queue() {
        this.container = new ArrayList<>();
    }

    // 将一个元素添加到队列尾部
    public void add(int value) {
        container.add(value);
    }

    // 将一个元素从队列头部移走
    public int remove() {
        return container.size() > 0 ? container.remove(0) : -1;
    }
}
