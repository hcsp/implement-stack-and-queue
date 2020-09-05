package com.github.hcsp.datastructure;

import java.util.ArrayList;

public class Stack {
    public static ArrayList<Integer> queue = new ArrayList<>();

    // 将一个元素压入栈内
    public void push(int value) {
        queue.add(value);
    }

    // 从栈顶弹出一个元素
    public int pop() {
        if (queue.isEmpty()) {
            return -1;
        }
        return queue.remove(queue.size() - 1);
    }
}
