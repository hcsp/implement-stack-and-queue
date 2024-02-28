package com.github.hcsp.datastructure;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    List<Integer> q;

    public Queue() {
        q = new ArrayList<>();
    }

    // 将一个元素添加到队列尾部
    public void add(int value) {
        q.add(value);
    }

    // 将一个元素从队列头部移走
    public int remove() {
        return q.remove(0);
    }
}
