package com.github.hcsp.datastructure;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> capacity = new ArrayList<Integer>();

    // 将一个元素压入栈内
    public void push(int value) {
        capacity.add(value);
    }

    // 从栈顶弹出一个元素
    public int pop() {
        if (isEmpty()){
            return -1;
        }
        return capacity.remove(capacity.size()-1);
    }

    public boolean isEmpty() {
        return capacity.size() == 0;
    }
}
