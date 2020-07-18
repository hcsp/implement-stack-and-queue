package com.github.hcsp.datastructure;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    // 将一个元素添加到队列尾部
    List<Object> list = new ArrayList<>();

    public void add(int value) {
        list.add(value);
    }

    // 将一个元素从队列头部移走
    public int remove() {
        return (int) list.remove(0);
    }
}
