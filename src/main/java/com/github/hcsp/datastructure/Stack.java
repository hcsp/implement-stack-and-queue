package com.github.hcsp.datastructure;

import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> arrayList;

    // 将一个元素压入栈内
    public void push(int value) {
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        arrayList.add(value);
    }

    // 从栈顶弹出一个元素
    public int pop() {
        if (arrayList != null && arrayList.size() > 0) {
            return arrayList.remove(arrayList.size() - 1);
        }
        return Integer.parseInt(null);
    }
}
