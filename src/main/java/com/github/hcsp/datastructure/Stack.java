package com.github.hcsp.datastructure;

import java.util.ArrayList;

public class Stack {
    ArrayList<Integer> stack = new ArrayList<>();

    // 将一个元素压入栈内
    public void push(int value) {
        stack.add(value);
    }

    // 从栈顶弹出一个元素
    public int pop() {
        return stack.remove(stack.size() - 1);
    }
}




