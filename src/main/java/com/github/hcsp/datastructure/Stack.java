package com.github.hcsp.datastructure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Stack {

    List<Integer> stack = new ArrayList<>();

    // 将一个元素压入栈内
    public void push(int value) {
        this.stack.add(value);
    }

    // 从栈顶弹出一个元素
    public int pop() {
        return this.stack.remove(stack.size()-1);
    }
}
