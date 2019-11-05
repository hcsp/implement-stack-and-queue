package com.github.hcsp.datastructure;

public class Queue {

    Node first;
    Node last;

    static class Node {
        int value;
        Node next;
    }

    boolean isEmpty() {
        return first == null;
    }

    // 将一个元素添加到队列尾部
    public void add(int value) {
        Node curr = new Node();
        curr.value = value;
        if (isEmpty()) {
            first = last = curr;
        } else {
            last.next = curr;
            last = curr;
        }
    }

    // 将一个元素从队列头部移走
    public int remove() {
        if (isEmpty()) {
            last = null;
            throw new RuntimeException("空队列异常");
        }
        int removeValue = first.value;
        first = first.next;
        return removeValue;
    }
}
