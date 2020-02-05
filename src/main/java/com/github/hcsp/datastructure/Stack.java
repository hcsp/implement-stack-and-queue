package com.github.hcsp.datastructure;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Integer> stackList = new ArrayList<>();

    // 将一个元素压入栈内
    public void push(int value) {
        stackList.add(value);
    }

    // 从栈顶弹出一个元素
    public int pop() {
        return stackList.remove(stackList.size() - 1);
    }
}
