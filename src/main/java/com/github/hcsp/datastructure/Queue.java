package com.github.hcsp.datastructure;

import java.util.ArrayList;

public class Queue {

    public static ArrayList<Integer> queue = new ArrayList<>();

    // 将一个元素添加到队列尾部
    public void add(int value) {
        queue.add(value);
    }

    // 将一个元素从队列头部移走
    public int remove() {
        if (queue.isEmpty()) {
            return -1;
        }
        return queue.remove(0);
    }
}
