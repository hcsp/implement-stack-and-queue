package com.github.hcsp.datastructure;

import java.util.LinkedList;
import java.util.List;

public class Stack {
    List<Integer> linkedList = new LinkedList<>();

    // 将一个元素压入栈内
    public void push(int value) {
        linkedList.add(value);
    }

    // 从栈顶弹出一个元素
    public int pop() {
        if (linkedList.isEmpty()) {
            return -1;
        }

        return linkedList.remove(linkedList.size() - 1);
    }
}
