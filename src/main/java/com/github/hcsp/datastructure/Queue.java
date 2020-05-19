package com.github.hcsp.datastructure;

public class Queue {
    private Node head;
    private Node tail;

    // 将一个元素添加到队列尾部
    public void add(int value) {
        if (head == null) {
            head = new Node(value);
            tail = head;
        } else {
            tail.next = new Node(value);
            tail = tail.next;
        }
    }

    // 将一个元素从队列头部移走
    public int remove() {
        if (tail == null) {
            throw new RuntimeException("队列为空！");
        }
        Node node = head;
        head = head.next;
        return node.value;
    }

}

class Node {
    Node next;
    int value;

    Node(int value) {
        this.value = value;
    }
}
