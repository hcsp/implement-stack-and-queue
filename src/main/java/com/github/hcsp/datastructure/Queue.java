package com.github.hcsp.datastructure;

import java.util.ArrayList;

public class Queue {
    ArrayList<Integer> arrayList = new ArrayList<>();

    // 将一个元素添加到队列尾部
    public void add(int value) {
        arrayList.add(value);
    }

    // 将一个元素从队列头部移走
    public int remove() {
        return arrayList.remove(0);
    }
}
