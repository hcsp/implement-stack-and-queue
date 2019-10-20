package com.github.hcsp.datastructure;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Integer> list;

    public Stack() {
        list = new ArrayList<>();
    }

    // 将一个元素压入栈内
    public void push(int value) {
        list.add(list.size(), value);
    }

    // 从栈顶弹出一个元素
    public int pop() {
        if (list.size() < 1) {
            throw new IndexOutOfBoundsException();
        }
        return list.remove(list.size() - 1);
    }
}
