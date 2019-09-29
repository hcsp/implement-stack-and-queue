package com.github.hcsp.datastructure;

public class Queue {
    Node first = null;
    Node last = null;

    static class Node {
        int value;
        Node next;
    }

    boolean isEmpty() {
        return this.first == null;
    }

    // 将一个元素添加到队列尾部
    public void add(int value) {
        Node curr = new Node();
        curr.value = value;
        if (isEmpty()) {
            first = curr;
            last = curr;
        } else {
            last.next = curr;
            last = curr;
        }
    }

    // 将一个元素从队列头部移走
    public int remove() {
        int removedValue = first.value;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        return removedValue;
    }
}
