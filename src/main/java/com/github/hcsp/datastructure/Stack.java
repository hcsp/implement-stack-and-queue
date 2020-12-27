package com.github.hcsp.datastructure;

public class Stack {
    private Node last;

    // 将一个元素压入栈内
    public void push(int value) {
        if (last == null) {
            last = new Node(value, null);
        } else {
            last = new Node(value, last);
        }
    }

    // 从栈顶弹出一个元素
    public int pop() {
        int val = last.val;
        last = last.pre;
        return val;
    }

    private static class Node {
        int val;
        Node pre;

        public Node(int val, Node pre) {
            this.val = val;
            this.pre = pre;
        }
    }
}
