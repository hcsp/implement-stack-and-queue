package com.github.hcsp.datastructure;

import java.util.ArrayDeque;
import java.util.Deque;

public class Queue {
    private Deque<Integer> queue = new ArrayDeque<Integer>();

    // 将一个元素添加到队列尾部
    public void add(int value) {
        queue.add(value);
    }

    // 将一个元素从队列头部移走
    public int remove() {
        return queue.remove();
    }
}
