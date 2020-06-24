package com.github.hcsp.datastructure;

import java.util.LinkedList;
import java.util.List;

public class Queue {
    List<Integer> linkedList = new LinkedList<>();

    // 将一个元素添加到队列尾部
    public void add(int value) {
        linkedList.add(value);
    }

    // 将一个元素从队列头部移走
    public int remove() {
        if (linkedList.isEmpty()) {
            return -1;
        }

        return linkedList.remove(0);
    }
}
