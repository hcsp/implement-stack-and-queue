package com.github.hcsp.datastructure;

import java.util.LinkedList;

public class Queue {
    LinkedList<Integer> linkedList = new LinkedList<>();

    // 将一个元素添加到队列尾部
    public void add(int value) {
        linkedList.add(value);
    }

    // 将一个元素从队列头部移走
    public int remove() {
        return linkedList.pop();
    }
}
