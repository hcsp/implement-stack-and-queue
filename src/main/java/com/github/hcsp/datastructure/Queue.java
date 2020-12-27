package com.github.hcsp.datastructure;

public class Queue {
    private Node first;
    private Node last;

    // 将一个元素添加到队列尾部
    public void add(int value) {
        if (first == null) {
            first = last = new Node(value);
        } else {
            last.next = new Node(value);
            last = last.next;
        }
    }

    // 将一个元素从队列头部移走
    public int remove() {
        if (first == null) {
            throw new RuntimeException("没有元素了");
        }
        int val = first.val;
        first = first.next;
        return val;
    }

    private static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
