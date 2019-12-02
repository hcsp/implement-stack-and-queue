package com.github.hcsp.datastructure;

import java.util.*;

public class Stack {
    // 将一个元素压入栈内
    List<Integer> stack = new ArrayList<>();

    public void push(int value) {
        stack.add(value);
    }

    // 从栈顶弹出一个元素
    public int pop() {
        int res = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return res;
    }
}
