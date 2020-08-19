package com.github.hcsp.datastructure;


public class Stack {
    private Node top;

    class Node {
        private Node next;
        private int value;

        Node(int value) {
            this.value = value;
        }
    }

    // 将一个元素压入栈内
    public void push(int value) {
        Node node = new Node(value);
        node.next = top;
        top = node;
    }

    // 从栈顶弹出一个元素
    public int pop() {
        int temp = 0;
        if (top != null) {
            temp = top.value;
            top = top.next;
        }
        return temp;
    }
}
