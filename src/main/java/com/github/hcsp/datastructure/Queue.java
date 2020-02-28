package com.github.hcsp.datastructure;

import java.util.ArrayList;

public class Queue {
    private ArrayList<Integer> arrayList;

    // 将一个元素添加到队列尾部
    public void add(int value) {
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(value);
    }

    // 将一个元素从队列头部移走
    public int remove() {
        if (arrayList != null && arrayList.size() > 0) {
            return arrayList.remove(0);
        }
        return Integer.parseInt(null);
    }
}
