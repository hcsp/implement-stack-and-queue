package com.github.hcsp.datastructure;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    /**
     * 定义：栈是一种特殊的数组，ArrayList又是一种动态数组，那么可以通过ArrayList实现队列
     * 队列：栈顶才能新增或者删除元素
     */
    List<Object> list = new ArrayList<>();

    // 将一个元素压入栈内
    public void push(int value) {
        list.add(0, value);
    }

    // 从栈顶弹出一个元素
    public int pop() {
        return (int) list.remove(0);
    }
}
