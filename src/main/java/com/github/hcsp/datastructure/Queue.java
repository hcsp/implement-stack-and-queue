package com.github.hcsp.datastructure;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    /**
     * 定义：队列是一种特殊的数组，ArrayList又是一种动态数组，那么可以通过ArrayList实现队列
     * 队列：对尾插入元素，对头删除元素
     */
    List<Object> list = new ArrayList<>();

    // 将一个元素添加到队列尾部
    public void add(int value) {
        // 往列表中添加值
        list.add(value);
    }

    // 将一个元素从队列头部移走
    public int remove() {
        // 从数组中移除第一个元素元素
        return (int) list.remove(0);
    }
}
