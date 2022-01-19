package com.github.hcsp.datastructure;

import java.util.ArrayList;
import java.util.List;

public class Queue {

    List<Integer> queueList = new ArrayList<>();

    // 将一个元素添加到队列尾部
    public void add(int value) {
        queueList.add(value);


    }

    // 将一个元素从队列头部移走
    public int remove() {
        return queueList.remove(0);
    }
}
