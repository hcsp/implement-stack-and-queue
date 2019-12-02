package com.github.hcsp.datastructure;

import java.util.*;

public class Queue {
    // 将一个元素添加到队列尾部
    LinkedList<Integer> queue = new LinkedList<>();

    public void add(int value) {
        queue.add(value);
    }

    // 将一个元素从队列头部移走
    public int remove() {
        int res = queue.get(0);
        queue.remove();
        return res;
    }
}
