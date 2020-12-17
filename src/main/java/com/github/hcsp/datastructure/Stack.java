package com.github.hcsp.datastructure;

import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {
    private Node head = null;

    // 将一个元素压入栈内
    public void push(int value) {
        if (head == null) {
            head = new Node(value);
            return;
        }
        Node temp = head;
        head = new Node(value, temp);
    }

    // 从栈顶弹出一个元素
    public int pop() {
        if (head == null) {
            return -1;
        }
        int value=head.value;
        head = head.next;
        return value;
    }

}
