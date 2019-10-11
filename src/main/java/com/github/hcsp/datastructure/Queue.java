package com.github.hcsp.datastructure;

import java.util.NoSuchElementException;

public class Queue {
    static class Node {
        int val;
        Node next;
    }

    Node head = null;
    Node tail = null;
    // 将一个元素添加到队列尾部
    public void add(int value) {
        Node curr = new Node();
        curr.val = value;
        if (tail == null) {
            head = curr;
        }else {
            tail.next = curr;
        }
        tail = curr;
    }

    // 将一个元素从队列头部移走
    public int remove() {
        if (head == null) {
            throw new NoSuchElementException();
        }
        int val = head.val;
        head = head.next;
        return val;
    }
}
