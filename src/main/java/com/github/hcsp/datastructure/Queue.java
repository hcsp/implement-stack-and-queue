package com.github.hcsp.datastructure;

import java.util.ArrayDeque;
import java.util.Deque;

public class Queue {
    Deque<Integer> deque = new ArrayDeque<>();

    // 将一个元素添加到队列尾部
    public void add(int value) {
        deque.addLast(value);
    }

    // 将一个元素从队列头部移走
    public int remove() {
        return deque.removeFirst();
    }
}
