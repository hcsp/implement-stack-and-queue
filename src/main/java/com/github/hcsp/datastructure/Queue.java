package com.github.hcsp.datastructure;

import java.util.LinkedList;

public class Queue {
    private final LinkedList<Integer> queue = new LinkedList<>();

    // 将一个元素添加到队列尾部
    public void add(int value) {
        queue.add(value);
    }

    // 将一个元素从队列头部移走
    public int remove() {
        return queue.removeFirst();
    }
}
