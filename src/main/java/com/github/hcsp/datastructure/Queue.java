package com.github.hcsp.datastructure;

import java.util.LinkedList;

public class Queue {
    // 将一个元素添加到队列尾部
    java.util.Queue<Integer> queue = new LinkedList<>();

    public void add(int value) {
        queue.add(value);
    }

    // 将一个元素从队列头部移走
    public int remove() {
        return queue.remove();
    }
}
