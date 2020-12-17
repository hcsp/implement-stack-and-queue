package com.github.hcsp.datastructure;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {
    Deque<Integer> simple_Stack = new ArrayDeque<Integer>();
    // 将一个元素压入栈内
    public void push(int value) {
        simple_Stack.push(value);
    }

    // 从栈顶弹出一个元素
    public int pop() {
        return simple_Stack.pop();
    }
}
