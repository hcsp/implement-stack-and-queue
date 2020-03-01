package com.github.hcsp.datastructure;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    private List<Integer> queueList = new ArrayList<>();

    public List<Integer> getQueueList() {
        return queueList;
    }

    // 将一个元素添加到队列尾部
    public void add(int value) {
        this.getQueueList().add(value);
    }

    // 将一个元素从队列头部移走
    public int remove() {
        return this.getQueueList().remove(0);
    }
}
