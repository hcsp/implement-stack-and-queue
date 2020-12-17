package com.github.hcsp.datastructure;

public class Queue {
    private Node head = null;

    // 将一个元素添加到队列尾部
    public void add(int value) {
        Node toAdd = new Node(value);
        if (head == null) {
            head = toAdd;
            return;
        }
        Node tail = head;
        Node current = head;
        // for (Node current = head; current.next != null; current = current.next,tail = current) {
        // } 也可以
        while (current != null) {
            tail = current;
            current = current.next;
        }

        tail.next = toAdd;
    }

    // 将一个元素从队列头部移走
    public int remove() {
        if (head == null) {
            return -1;
        }
        int value = head.value;
        head = head.next;
        return value;
    }

}

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
