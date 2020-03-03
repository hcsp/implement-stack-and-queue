package com.github.hcsp.datastructure;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    // 将一个元素添加到队列尾部
    List<Integer> list=new ArrayList<>();
    int start=0;
    int end=-1;
    public void add(int value) {
        list.add(value);
        end++;
    }

    // 将一个元素从队列头部移走
    public int remove() {
        return list.get(start++);
    }
}
