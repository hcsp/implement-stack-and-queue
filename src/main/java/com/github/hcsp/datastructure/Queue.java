package com.github.hcsp.datastructure;

import java.util.LinkedList;

public class Queue {
    // Queue 在 Java 中是一个接口
    // 常见的实现类为 LinkedList
    private LinkedList<Integer> list = new LinkedList<>();

    // 将一个元素添加到队列尾部
    public void add(int value) {
        list.add(value);
    }

    // 将一个元素从队列头部移走
    public int remove() {
        int first = list.getFirst();
        list.removeFirst();
        return first;
    }
}
