package com.github.hcsp.datastructure;

import java.util.NoSuchElementException;

public class Stack {
    static class Node {
        Node prev;
        int val;
        Node next;
    }

    Node head = null;
    Node tail = null;

    // 将一个元素压入栈内
    public void push(int value) {
        Node curr = new Node();
        curr.val = value;

        if (tail == null) {
            head = curr;
        } else {
            curr.prev = tail;
            tail.next = curr;

        }
        tail = curr;
    }

    // 从栈顶弹出一个元素
    public int pop() {
        if (tail == null) {
            throw new NoSuchElementException();
        }
        int val = tail.val;
        tail = tail.prev;
        return val;
    }
}
