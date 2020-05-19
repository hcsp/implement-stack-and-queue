package com.github.hcsp.datastructure;

public class Stack {
    private Node current;

    // 将一个元素压入栈内
    public void push(int value) {
        if (current == null) {
            current = new Node(value);
        } else {
            Node node = new Node(value);
            node.next = current;
            current = node;
        }
    }

    // 从栈顶弹出一个元素
    public int pop() {
        if (current == null) {
            throw new RuntimeException("栈为空");
        }
        Node node = current;
        current = current.next;
        return node.value;
    }
}
