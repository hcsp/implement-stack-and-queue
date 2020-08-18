package com.github.hcsp.datastructure;

public class Stack {
    private Node top = null;

    // 将一个元素压入栈内
    public void push(int value) {
        Node node = new Node(value);
        node.next = top;
        top = node;
    }

    // 从栈顶弹出一个元素
    public int pop() {
        if (top == null) {
            return 0;
        }
        int value = top.value;
        top = top.next;
        return value;
    }

}

