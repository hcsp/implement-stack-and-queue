package com.github.hcsp.datastructure;

import java.util.LinkedList;
import java.util.List;

public class Queue {
    private final List<Integer> value = new LinkedList<>();
    int start = 0;
    int end = 0;

    // 将一个元素添加到队列尾部
    public void add(int value) {
        this.value.add(end++, value);
    }

    // 将一个元素从队列头部移走
    public int remove() {
        return this.value.get(start++);
    }
}
