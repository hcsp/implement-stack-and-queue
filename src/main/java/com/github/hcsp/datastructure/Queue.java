package com.github.hcsp.datastructure;

import java.util.ArrayList;

public class Queue {
    private ArrayList<Integer> capacity = new ArrayList<Integer>();

    // 将一个元素添加到队列尾部
    public void add(int value) {
        capacity.add(value);
    }

    // 将一个元素从队列头部移走
    public int remove() {
        if (isEmpty()){
            return -1;
        }
        return capacity.remove(0);
    }

    public boolean isEmpty() {
        return capacity.size() == 0;
    }
}
